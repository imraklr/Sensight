@file:Suppress("UNUSED_PARAMETER")

package com.sensight.ui.components

import android.content.Context
import android.hardware.Sensor
import android.widget.Toast
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
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.Spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import com.sensight.data.repository.getCommonPropertiesAmongSensorsForComponentInfoComposable

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SensorCard(
    sensor: Sensor,
    context: Context = LocalContext.current,
    modifier: Modifier = Modifier
) {
    Spacer(modifier = Modifier.padding(top = 4.dp))
    var expanded by remember { mutableStateOf(false) }
    val haptics = LocalHapticFeedback.current
    Card(
        modifier = Modifier
            .padding(top = 4.dp)
            .combinedClickable(
                onClick = {
                    expanded = !expanded
                },
                onLongClick = {
                    haptics.performHapticFeedback(HapticFeedbackType.LongPress)
                    /*
                     * Calls to other activity/composable goes here
                    */
                }
            )
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessVeryLow
                    )
                )
        ) {
            SensorNameText(
                 sensor = sensor
            )
            SensorVendorText(
                 sensor = sensor
            )
            // Following composable will be expanded on click on the column and contracted
            // respectively
            if(expanded)
                InfoComposable(sensor = sensor)
        }
    }
    Spacer(modifier = Modifier.padding(top = 4.dp))
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

@Composable
fun InfoComposable(
    sensor: Sensor,
    modifier: Modifier = Modifier
) {
    val list = getCommonPropertiesAmongSensorsForComponentInfoComposable(sensor)
    Column {
        list.forEach { item ->
            Row {
                Text(
                    text = stringResource(item.type),
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxWidth()
                        .padding(start = 8.dp),
                    textAlign = TextAlign.Start
                )
                Text(
                    text = item.property,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}

// Previews ( if any ) goes here ........