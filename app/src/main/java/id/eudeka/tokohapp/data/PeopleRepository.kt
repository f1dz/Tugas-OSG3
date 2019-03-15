package id.eudeka.tokohapp.data

import id.eudeka.tokohapp.data.local.PeopleLocalDataSource
import id.eudeka.tokohapp.data.remote.PeopleRemoteDataSource

class PeopleRepository(
    private val peopleRemoteDataSource: PeopleRemoteDataSource,
    private val peopleLocalDataSource: PeopleLocalDataSource
): PeopleDataSource {

    override fun getListPeoples(callback: PeopleDataSource.GetPeoplesCallback) {
        TODO("not implemented") //Silahkan dikerjakan
    }

    private fun getPeopleFromRemoteDataSource(callback: PeopleDataSource.GetPeoplesCallback?) {
        TODO("not implemented") //Silahkan dikerjakan
    }
}