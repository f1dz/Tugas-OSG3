package id.eudeka.tokohapp.data

import id.eudeka.tokohapp.model.People

interface PeopleDataSource {

    fun getListPeoples(callback: GetPeoplesCallback)

    interface GetPeoplesCallback {
        fun onPeopleLoaded(data: People)
        fun onDataNotAvailable(errorMessage: String)
    }
}