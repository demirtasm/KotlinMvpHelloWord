package com.example.muko.kotlinmvphelloword.Contract

interface MainActivityContract {
    interface View{
        fun bindViews()

        fun initOnClick()

        fun setTextView(data: String)

        fun setTextVisibility(visible: Int)

    }
    interface Model{
        fun getDate(): String
    }
    interface Presenter{
        fun setView(view: View)

        fun created()

        fun onClickable()
    }
}