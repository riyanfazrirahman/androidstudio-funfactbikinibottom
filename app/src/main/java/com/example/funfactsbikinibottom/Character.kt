package com.example.funfactsbikinibottomimport android.os.Parcelableimport android.util.EventLogTags.Descriptionimport kotlinx.parcelize.Parcelize@Parcelizedata class Character(    val name: String,    val funfact: String,    val birthday: String,    val job: String,    val description: String,    val photo: Int) : Parcelable