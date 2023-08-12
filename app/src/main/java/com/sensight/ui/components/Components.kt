package com.sensight.ui.components

import android.hardware.Sensor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.style.TextAlign

@Composable
fun SensorCard(
    sensor: Sensor,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .padding(top = 12.dp)
    ) {
        Column(modifier = Modifier) {
            SensorNameText(
                 sensor = sensor
            )
            SensorVendorText(
                 sensor = sensor
            )
        }
    }
}

/*
 * All the text composable must be wrapped inside a Column composable
*/

// The first Text Composable that shows the name of the sensor
@Composable
fun SensorNameText(
    sensor: Sensor,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
             text = sensor.name,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

// The second Text composable that shows the vendor of this sensor
@Composable
fun SensorVendorText(
     sensor: Sensor,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
    ) {
        Text(
            text = sensor.vendor,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.End
        )
    }
}

// Previews ( if any ) goes here ........