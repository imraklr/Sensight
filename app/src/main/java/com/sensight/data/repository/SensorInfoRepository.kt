package com.sensight.data.repository

import android.hardware.Sensor
import com.sensight.R
import com.sensight.ui.model.CommonToComponentInfoComposable

fun getCommonPropertiesAmongSensorsForComponentInfoComposable(sensor: Sensor) : List<CommonToComponentInfoComposable> {
    return listOf(
        CommonToComponentInfoComposable(
            R.string.sensor_id, sensor.id.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_fifoMaxEventCount, sensor.fifoMaxEventCount.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_fifoReservedEventCount, sensor.fifoReservedEventCount.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_maxDelay, sensor.maxDelay.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_highestDirectReportRateLevel,
            sensor.highestDirectReportRateLevel.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_minDelay, sensor.minDelay.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_reportingMode, sensor.reportingMode.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_type, sensor.type.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_version, sensor.version.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_isAdditionalInfoSupported,
            sensor.isAdditionalInfoSupported.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_isDynamicSensor, sensor.isDynamicSensor.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_power, sensor.power.toString()
        ),
        CommonToComponentInfoComposable(
            R.string.sensor_isWakeUpSensor, sensor.isWakeUpSensor.toString()
        ),
    )
}