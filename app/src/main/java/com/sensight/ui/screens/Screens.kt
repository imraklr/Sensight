package com.sensight.ui.screens

import android.hardware.SensorManager
import android.hardware.Sensor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun StartScreen(
    sensorManager: SensorManager,
    modifier: Modifier
) {
    LazyColumn {
        items(sensorManager.getSensorList(Sensor.TYPE_ALL)) { item ->
            // Dispatch this item `item` to every components
        }
    }
}

// Add preview(if required)