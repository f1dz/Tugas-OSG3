package id.eudeka.tokohapp.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import id.eudeka.tokohapp.model.PeopleDetail

@Database(entities = [PeopleDetail::class], version = 1)
abstract class PeopleDatabase: RoomDatabase() {

    abstract fun peopleDao(): PeopleDao

    companion object {
        private var INSTANCE: PeopleDatabase? = null

        fun getInstance(context: Context): PeopleDatabase? {
            if(INSTANCE == null) {
                synchronized(PeopleDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        PeopleDatabase::class.java, "people.db")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}