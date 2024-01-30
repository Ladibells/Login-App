package com.bg.loginandregistration.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bg.loginandregistration.R
import com.bg.loginandregistration.components.ButtonComponent
import com.bg.loginandregistration.components.ClickableLoginTextComponent
import com.bg.loginandregistration.components.DividerTextComponent
import com.bg.loginandregistration.components.HeadingTextComponent
import com.bg.loginandregistration.components.MyTextFieldComponent
import com.bg.loginandregistration.components.NormalTextComponent
import com.bg.loginandregistration.components.PasswordTextFieldComponent
import com.bg.loginandregistration.components.UnderLinedNormalTextComponent
import com.bg.loginandregistration.data.LoginViewModel
import com.bg.loginandregistration.data.UIEvent
import com.bg.loginandregistration.navigation.PostOfficeAppRouter
import com.bg.loginandregistration.navigation.Screen
import com.bg.loginandregistration.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen(loginViewModel: LoginViewModel = viewModel()) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {

        Column {

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(labelValue = stringResource(id = R.string.email), imageIcon = Icons.Outlined.Email,
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                }
            )

            PasswordTextFieldComponent(labelValue = stringResource(id = R.string.password),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

            UnderLinedNormalTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })

        }

    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}