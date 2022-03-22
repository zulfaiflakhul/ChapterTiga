package aplikasi.serializable

import android.os.Parcel
import android.os.Parcelable

data class PersonPercelable(val name : String?, val email : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonPercelable> {
        override fun createFromParcel(parcel: Parcel): PersonPercelable {
            return PersonPercelable(parcel)
        }

        override fun newArray(size: Int): Array<PersonPercelable?> {
            return arrayOfNulls(size)
        }
    }
}
