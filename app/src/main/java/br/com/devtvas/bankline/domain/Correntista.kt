package br.com.devtvas.bankline.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
//@Parcelize serve para quebrar em varios pedacos
@Parcelize
data class Correntista (
    val id : Int
): Parcelable