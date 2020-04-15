package com.example.madlevel3task2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Link(
    val name: String,
    val url: String

) : Parcelable