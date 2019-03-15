package id.eudeka.tokohapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class People(
    @SerializedName("results")
    val peoples: List<PeopleDetail>? = null
): Parcelable