package fr.android.androidexercises

import android.os.Parcel
import android.os.Parcelable

// TODO parcel

data class Book(val name: String, val author: String) : Parcelable {

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(author)
    }

    override fun describeContents(): Int {
        return 0
    }

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }
}

