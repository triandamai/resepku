/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.signIn

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.trian.filebox.R
import app.trian.resepku.base.BaseMainApp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ScreenSignIn(
    modifier: Modifier = Modifier,
    onSignInBasic: (email: String, password: String) -> Unit,
    onSignInGoogle: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 16.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Welcome Back!",
                style = MaterialTheme.typography.titleMedium,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "PLease enter your account here")
            Spacer(modifier = Modifier.height(16.dp))

        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Center
        ) {

            OutlinedTextField(value = "", modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Email")
            }, onValueChange = {})
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(value = "", modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Email")
            }, onValueChange = {})
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Forgot password?"
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(4.dp),
                onClick = { onSignInBasic("", "") }) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Or continue with"
            )
            Spacer(modifier = Modifier.height(12.dp))
            Button(modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colorScheme.background
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.primary
                ),
                shape = RoundedCornerShape(4.dp),
                onClick = { onSignInGoogle() }) {
                Image(
                    painter = painterResource(id = R.drawable.icon_google),
                    contentDescription = "Icon google",
                    modifier = Modifier.size(
                        30.dp
                    )
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Google",
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewScreenSignIn() {
    BaseMainApp {
        ScreenSignIn(
            onSignInBasic = { _, _ -> },
            onSignInGoogle = {}
        )
    }

}