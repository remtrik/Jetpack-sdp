package com.gixousiyq.sdp

import android.content.res.Configuration
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object SdpScreenDimensionValues {
    var smallestWidth : Int = 0
}

// Assigns values to the variables above
@Composable
fun AssValsToTheSdpObject() {
    val config = LocalConfiguration.current
    SdpScreenDimensionValues.smallestWidth = config.smallestScreenWidthDp
}

// Will return the smallestWidth approximated to nearest 30 to improve performance
fun ApproximateWidth(value: Int): Int {
    val remainder = value % 30
    return if (remainder <= 15) {
        value - remainder
    } else {
        value + (30 - remainder)
    }
}

@Composable
fun Int.sdp(): Dp {
    if (SdpScreenDimensionValues.smallestWidth == 0) {
        AssValsToTheSdpObject()
    }
    val ratio = (ApproximateWidth(SdpScreenDimensionValues.smallestWidth))/300.0
    Log.println(Log.ERROR,"Main", ratio.toString())
    val final = this*ratio
    return final.dp
}
