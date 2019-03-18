package id.eudeka.tokohapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import id.eudeka.tokohapp.data.local.Converters
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "film")
@TypeConverters(Converters::class)
@Parcelize
data class Film(

    @PrimaryKey
    @ColumnInfo(name = "url")
    @SerializedName("url")
    val url: String? = null,

    @ColumnInfo(name = "title")
    @SerializedName("title")
    val title: String? = null,

    @ColumnInfo(name = "episode_id")
    @SerializedName("episode_id")
    val episodeId: String? = null,

    @ColumnInfo(name = "opening_crawl")
    @SerializedName("opening_crawl")
    val openingCrawl: String? = null,

    @ColumnInfo(name = "director")
    @SerializedName("director")
    val director: String? = null,

    @ColumnInfo(name = "producer")
    @SerializedName("producer")
    val producer: String? = null,

    @ColumnInfo(name = "release_date")
    @SerializedName("release_date")
    val releaseDate: String? = null,

    @ColumnInfo(name = "characters")
    @SerializedName("characters")
    val characters: ArrayList<String>? = null,

    @ColumnInfo(name = "planets")
    @SerializedName("planets")
    val planets: ArrayList<String>? = null,

    @ColumnInfo(name = "starships")
    @SerializedName("starships")
    val starships: ArrayList<String>? = null,

    @ColumnInfo(name = "vehicles")
    @SerializedName("vehicles")
    val vehicles: ArrayList<String>? = null,

    @ColumnInfo(name = "species")
    @SerializedName("species")
    val species: ArrayList<String>? = null

) : Parcelable