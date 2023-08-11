package com.sensight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import com.sensight.ui.theme.SensightTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensightTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    /*
                        Calling of the composable which is to be displayed on start of the
                        application
                    */
                }
            }
        }
    }
}