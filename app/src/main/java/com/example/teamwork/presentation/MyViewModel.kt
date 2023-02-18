package com.example.teamwork.presentation

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyViewModel(private val application: Application) : AndroidViewModel(application) {
    private var timer: CountDownTimer? = null

    private val _formattedTime = MutableLiveData<String>()
    val formattedTime: LiveData<String>
        get() = _formattedTime

    private val _errorInputPhoneNumber = MutableLiveData<Boolean>()

    fun startTimer() {
        timer = object : CountDownTimer(60 * MILLIS_IN_SECONDS, MILLIS_IN_SECONDS) {
            override fun onTick(millisUntilFinished: Long) {
                //В _formattedTime хранится уже преобразованный String типа '00:00'
                _formattedTime.value = formatTime(millisUntilFinished)
            }

            override fun onFinish() {
                Toast.makeText(application, "1 minute finish", Toast.LENGTH_SHORT).show()
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
        val isEmptyPassword = parseName1.isEmpty() || parseName2.isEmpty()
        val isSamePassword = password == confirmPassword
        return !isEmptyPassword && !isSamePassword
    }

    fun validateNameSurname(firstName: String, secondName: String): Boolean {
        val parseName1 = parseText(firstName)
        val parseName2 = parseText(secondName)
        return parseName1.isNotEmpty() || parseName2.isNotEmpty()
    }

    fun validateCode(codeText: String): Boolean {
        return codeText.length == 5
    }

    fun validateInputPhone(name: String): Boolean {
        parseText(name)
        var result = true
        if (name.isBlank() || name.length < 9) {
            _errorInputPhoneNumber.value = true
            result = false
        }
        return result
    }

    private fun parseText(inputName: String?): String {
        return inputName?.trim() ?: ""
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }

    fun resetErrorInputName() {
        _errorInputPhoneNumber.value = false
    }

    companion object {
        private const val MILLIS_IN_SECONDS = 1000L
        private const val SECONDS_IN_MINUTES = 60L
    }
}