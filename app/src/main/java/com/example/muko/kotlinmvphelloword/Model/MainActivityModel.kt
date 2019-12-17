package com.example.muko.kotlinmvphelloword.Model

import com.example.muko.kotlinmvphelloword.Contract.MainActivityContract

class MainActivityModel : MainActivityContract.Model {
    override fun getDate():String {
        return "Hello MVP"
    }

}