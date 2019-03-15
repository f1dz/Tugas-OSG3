package id.eudeka.tokohapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "people")
@Parcelize
data class PeopleDetail(

    @PrimaryKey(autoGenerate = true)
    var mId: Int,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String? = null,

    @ColumnInfo(name = "height")
    @SerializedName("height")
    val height: Int? = 0,

    @ColumnInfo(name = "mass")
    @SerializedName("mass")
    val mass: Int? = 0,

    @ColumnInfo(name = "hair_color")
    @SerializedName("hair_color")
    val hairColor: String? = null,

    @ColumnInfo(name = "skin_color")
    @SerializedName("skin_color")
    val skinColor: String? = null,

    @ColumnInfo(name = "eye_color")
    @SerializedName("eye_color")
    val eyeColor: String? = null,

    @ColumnInfo(name = "birth_year")
    @SerializedName("birth_year")
    val birthYear: String? = null,

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    val gender: String? = null,

    @ColumnInfo(name = "homeworld")
    @SerializedName("homeworld")
    val homeWorld: String? = null,

    @ColumnInfo(name = "films")
    @SerializedName("films")
    val films: List<String>? = null,

    @ColumnInfo(name = "species")
    @SerializedName("species")
    val species: List<String>? = null,

    @ColumnInfo(name = "vehicles")
    @SerializedName("vehicles")
    val vehicles: List<String>? = null,

    @ColumnInfo(name = "starships")
    @SerializedName("starships")
    val starShips: List<String>? = null,

    @ColumnInfo(name = "url")
    @SerializedName("url")
    val url: String? = null

): Parcelable