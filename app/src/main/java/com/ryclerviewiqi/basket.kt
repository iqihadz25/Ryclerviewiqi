package com.ryclerviewiqi

import android.os.Parcel
import android.os.Parcelable

data class basket(val foto: Int, val nama: String?, val deskripsi: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nama)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<basket> {
        override fun createFromParcel(parcel: Parcel): basket {
            return basket(parcel)
        }

        override fun newArray(size: Int): Array<basket?> {
            return arrayOfNulls(size)
        }
    }
}