package com.example.muko.kotlinmvphelloword.Presenter

import com.example.muko.kotlinmvphelloword.Contract.MainActivityContract
import com.example.muko.kotlinmvphelloword.Model.MainActivityModel

class MainActivityPresenter : MainActivityContract.Presenter {

    private lateinit var mView: MainActivityContract.View
    var mModel: MainActivityModel =
        MainActivityModel()
    override fun onClickable() {
        var data = mModel.getDate()
        mView.setTextView(data)
    }

    override fun created() {
        this.mView.bindViews()
        this.mView.initOnClick()
    }

    override fun setView(view: MainActivityContract.View) {
        this.mView = view
    }
}