package id.eudeka.tokohapp.data.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import id.eudeka.tokohapp.model.PeopleDetail

@Dao
interface PeopleDao {

    @Query("SELECT * FROM people")
    fun getPeople(): List<PeopleDetail>

    @Insert
    fun insertPeople(people: List<PeopleDetail>)
}