package com.seunggyu.stitch.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class Location(
    val title: String,
    val latitude: String,
    val longitude: String,
)
