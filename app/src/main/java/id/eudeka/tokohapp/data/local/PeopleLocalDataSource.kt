package id.eudeka.tokohapp.data.local

import android.content.Context
import id.eudeka.tokohapp.data.PeopleDataSource
import id.eudeka.tokohapp.model.People
import id.eudeka.tokohapp.model.PeopleDetail

class PeopleLocalDataSource(var context: Context): PeopleDataSource {
    private var peopleDao: PeopleDao? = PeopleDatabase.getInstance(context)?.peopleDao()

    override fun getListPeoples(callback: PeopleDataSource.GetPeoplesCallback) {
        Thread(
            Runnable {
                peopleDao?.let {
                    if(it.getPeople().isEmpty()){
                        callback.onDataNotAvailable("Tidak ada data pada database SQLite")
                    } else {
                        val peoples = People(it.getPeople())
                        callback.onPeopleLoaded(peoples)
                    }
                }
            }
        ).start()
    }

    fun saveDataPeople(people: MutableList<PeopleDetail>) {
        Thread(
            Runnable {
                peopleDao?.insertPeople(people)
            }
        ).start()
    }

}