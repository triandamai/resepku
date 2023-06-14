package app.trian.resepku

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertHasNoClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import app.trian.core.ui.UIListener
import app.trian.core.ui.rememberUIController
import app.trian.resepku.feature.authentication.signIn.ScreenSignIn
import app.trian.resepku.feature.authentication.signIn.SignInEvent
import app.trian.resepku.feature.authentication.signIn.SignInState
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [29])
class ExampleUnitTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out // Redirect Logcat to console
    }

    @Test
    fun `when I test, then it works`() {
        // Some test code here
        composeTestRule.setContent {
            var state by remember {
                mutableStateOf(SignInState())
            }

            ScreenSignIn(
                uiEvent = UIListener(
                    controller = rememberUIController(),
                    state = state,
                    commit = {
                        state = it
                    },
                    dispatcher = {
                        when (it) {
                            is SignInEvent.OnEmailChange -> {}
                            is SignInEvent.OnPasswordChange -> {}
                            SignInEvent.SignInWithEmail -> {}
                        }

                    }
                )
            )
        }
        composeTestRule.onNodeWithTag("title_signin").assertIsDisplayed().assertHasNoClickAction()
        composeTestRule.onRoot().printToLog(tag="HOHO")
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}