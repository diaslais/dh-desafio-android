package com.laisd.desafio

import android.os.Parcel
import android.os.Parcelable

data class Prato(
    val foto: Int,
    val nome: String?,
    val descricao: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nome)
        parcel.writeString(descricao)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Prato> {
        override fun createFromParcel(parcel: Parcel): Prato {
            return Prato(parcel)
        }

        override fun newArray(size: Int): Array<Prato?> {
            return arrayOfNulls(size)
        }
    }
}