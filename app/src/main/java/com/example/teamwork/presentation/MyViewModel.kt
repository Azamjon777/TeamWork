package com.example.teamwork.presentation

import android.app.Application
import android.os.CountDownTimer
import android.view.View
import androidx.cardview.widget.CardView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.teamwork.R

class MyViewModel(private val application: Application) : AndroidViewModel(application) {
    private var timer: CountDownTimer? = null

    var textBoshOrBand = MutableLiveData<String>()
    init {
        textBoshOrBand.value = "Bo'sh"
    }

    private val _formattedTime = MutableLiveData<String>()
    val formattedTime: LiveData<String>
        get() = _formattedTime

    private var _cardCanBeGreen = MutableLiveData<Int>()
    val cardCanBeGreen: LiveData<Int>
        get() = _cardCanBeGreen

    private val _errorInputPhoneNumber = MutableLiveData<Boolean>()
    val errorInputPhoneNumber: LiveData<Boolean>
        get() = _errorInputPhoneNumber

    private val _validCode = MutableLiveData<Boolean>()
    val validCode: LiveData<Boolean>
        get() = _validCode

    fun startTimer() {
        timer = object : CountDownTimer(5 * MILLIS_IN_SECONDS, MILLIS_IN_SECONDS) {
            override fun onTick(millisUntilFinished: Long) {
                //В _formattedTime хранится уже преобразованный String типа '00:00'
                _formattedTime.value = formatTime(millisUntilFinished)
            }

            override fun onFinish() {
                _cardCanBeGreen.value =
                    application.getColor(R.color.green)//здесь пока не могу задать цвет
                _formattedTime.value = application.getString(R.string.send_new_code)
            }
        }
        timer?.start()
    }

    private fun formatTime(millisUntilFinished: Long): String {
        val seconds = millisUntilFinished / MILLIS_IN_SECONDS
        val minutes = seconds / SECONDS_IN_MINUTES
        val leftSeconds = seconds - (minutes * SECONDS_IN_MINUTES)
        return String.format("%02d:%02d", minutes, leftSeconds)
        //сверху мы минуты и секунды преобразуем типа 00:00
    }

    fun validatePassword(password: String, confirmPassword: String): Boolean {
        val parseName1 = parseText(password)
        val parseName2 = parseText(confirmPassword)
        val isEmptyPassword = (parseName1.isNotEmpty() && parseName2.isNotEmpty())
        val isSamePassword: Boolean = password == confirmPassword
        return (isEmptyPassword && isSamePassword)
    }

    fun validateName(firstName: String): Boolean {
        val parseName1 = parseText(firstName)
        return parseName1.isNotEmpty()
    }

    fun validateCode(codeText: String) {
        _validCode.value = codeText.length == 5
    }

    fun validateInputPhone(name: String): Boolean {
        parseText(name)
        var result = true
        if (name.length < 9) {
            _errorInputPhoneNumber.value = true
            result = false
        }
        return result
    }

    private fun parseText(inputName: String?): String {
        return inputName?.trim() ?: " "  //TODO
    }

    fun resetErrorInputName() {
        _errorInputPhoneNumber.value = false
    }

    fun afterSendNewMessage(cardTimer: CardView, cardNewCode: CardView) {
        cardTimer.visibility = View.GONE
        cardNewCode.visibility = View.VISIBLE
    }

    override fun onCleared() {
        //когда мы уходим из фрагменты необходимо чтобы timer() отменялся в методе onCleared()
        super.onCleared()
        timer?.cancel()
    }

//    fun changeTextToBand() {
//        if (textBoshOrBand.value == "Bo'sh") {
//            textBoshOrBand.value = "Band"
//        }
//    }
//
//    fun changeTextToBosh() {
//        if (textBoshOrBand.value == "Band") {
//            textBoshOrBand.value = "Bo'sh"
//        }
//    }

    companion object {
        private const val MILLIS_IN_SECONDS = 1000L
        private const val SECONDS_IN_MINUTES = 60L
    }
}