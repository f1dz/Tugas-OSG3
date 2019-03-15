package id.eudeka.tokohapp.navigator

import id.eudeka.tokohapp.model.PeopleDetail

interface PeopleNavigator {
    fun loadListPeople(listPeople: MutableList<PeopleDetail>)
    fun errorLoadPeople(errorMessage: String)
}