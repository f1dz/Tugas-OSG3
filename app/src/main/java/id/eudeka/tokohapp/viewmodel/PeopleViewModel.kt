package id.eudeka.tokohapp.viewmodel

import android.content.Context
import id.eudeka.tokohapp.data.PeopleDataSource
import id.eudeka.tokohapp.data.PeopleRepository
import id.eudeka.tokohapp.model.People
import id.eudeka.tokohapp.navigator.PeopleNavigator

class PeopleViewModel(val peopleRepository: PeopleRepository, context: Context) {
    private lateinit var peopleNavigator: PeopleNavigator

    fun setNavigator(peopleNavigator: PeopleNavigator) {
        this.peopleNavigator = peopleNavigator
    }

    fun getListPeople() {
        peopleRepository.getListPeoples(
            object : PeopleDataSource.GetPeoplesCallback {
                override fun onPeopleLoaded(data: People) {
                    peopleNavigator.loadListPeople(data.peoples)
                }

                override fun onDataNotAvailable(errorMessage: String) {
                    peopleNavigator.errorLoadPeople(errorMessage)
                }

            }
        )
    }
}