package com.bg.loginandregistration.data

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel(){

    var registrationUIState = mutableStateOf(RegistrationUIState())

    private var TAG = LoginViewModel::class.simpleName

    fun onEvent (event: UIEvent) {
        when(event) {
            is UIEvent.FirstNameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    firstName = event.firstName
                )
                printState()
            }

            is UIEvent.LastNameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    lastName = event.lastName
                )
                printState()
            }

            is UIEvent.EmailChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    email = event.email
                )
                printState()
            }

            is UIEvent.PasswordChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    password = event.password
                )
                printState()
            }

            is UIEvent.RegisterButtonClicked -> {
                signUP()
            }
        }
    }

    private fun signUP() {
        Log.d(TAG, "inside_signUp")
    }

    private fun printState () {
        Log.d(TAG, "Inside_prinState")
        Log.d(TAG, registrationUIState.value.toString())
    }

}