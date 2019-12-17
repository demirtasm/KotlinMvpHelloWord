package com.example.muko.kotlinmvphelloword.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.muko.kotlinmvphelloword.Contract.MainActivityContract
import com.example.muko.kotlinmvphelloword.Presenter.MainActivityPresenter
import com.example.muko.kotlinmvphelloword.R

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    private lateinit var mPresenter: MainActivityContract.Presenter

    private lateinit var tvHelloWord: TextView
    private lateinit var btnHelloWord: Button

    override fun setTextView(data: String) {
        tvHelloWord.text = data
        setTextVisibility(View.VISIBLE)
    }
    override fun setTextVisibility(visible: Int) {
        this.tvHelloWord.visibility = View.VISIBLE
    }
    override fun initOnClick() {
        btnHelloWord.setOnClickListener {
            this.mPresenter.onClickable()
        }
    }

    override fun bindViews() {
        this.btnHelloWord = findViewById(R.id.btnClick)
        this.tvHelloWord = findViewById(R.id.tvHelloWord)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.mPresenter = MainActivityPresenter()
        this.mPresenter.setView(this)
        this.mPresenter.created()
    }
}
