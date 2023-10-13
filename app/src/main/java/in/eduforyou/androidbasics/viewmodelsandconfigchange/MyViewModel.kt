package `in`.eduforyou.androidbasics.viewmodelsandconfigchange

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    // number to increment and show on UI
    var number = 0

    // function when called increments the value of number
    fun addNumber(): Int = number++

}