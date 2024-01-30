package com.bg.loginandregistration.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bg.loginandregistration.navigation.PostOfficeAppRouter
import com.bg.loginandregistration.R
import com.bg.loginandregistration.components.ButtonComponent
import com.bg.loginandregistration.navigation.Screen
import com.bg.loginandregistration.components.CheckboxComponent
import com.bg.loginandregistration.components.ClickableLoginTextComponent
import com.bg.loginandregistration.components.DividerTextComponent
import com.bg.loginandregistration.components.HeadingTextComponent
import com.bg.loginandregistration.components.MyTextFieldComponent
import com.bg.loginandregistration.components.NormalTextComponent
import com.bg.loginandregistration.components.PasswordTextFieldComponent

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.heightIn(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                imageIcon = Icons.Outlined.Person
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                imageIcon = Icons.Outlined.Person
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                imageIcon = Icons.Outlined.Email
            )

            PasswordTextFieldComponent(labelValue = stringResource(id = R.string.password))
            
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })

            Spacer(modifier = Modifier.heightIn(40.dp))
            
            ButtonComponent(value = stringResource(id = R.string.register))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
            
        }

    }

}

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}