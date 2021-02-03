package com.krisna_18102271.praktikum14.`interface`

import com.krisna_18102271.praktikum14.model.Login
import com.krisna_18102271.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)
}