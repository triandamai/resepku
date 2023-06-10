/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.components

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp

/**
 * FormInpit
 * author Trian Damai
 * created_at 30/01/22 - 09.02
 * site https://trian.app
 */
@Composable
fun FormInput(
    modifier: Modifier = Modifier,
    initialValue: String = "",
    placeholder: String = "",
    label: (@Composable () -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions(),
    onChange: (value: String) -> Unit = {}
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        label?.invoke()
        Spacer(modifier = modifier.height(8.dp))
        OutlinedTextField(
            modifier = modifier.fillMaxWidth(),
            value = initialValue,
            placeholder = {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            },
            onValueChange = {
                onChange(it)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.onSurface,
            ),
            shape = MaterialTheme.shapes.medium,
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                color = MaterialTheme.colorScheme.onSurface
            ),
            singleLine=true,
            keyboardActions = keyboardActions,
            keyboardOptions = keyboardOptions
        )
        Spacer(modifier = modifier.height(10.dp))
    }
}

@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
fun PreviewFormInput() {
    BaseMainApp {
        FormInput()
    }
}