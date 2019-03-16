package id.eudeka.tokohapp.data

import id.eudeka.tokohapp.data.local.PeopleLocalDataSource
import id.eudeka.tokohapp.data.remote.PeopleRemoteDataSource
import id.eudeka.tokohapp.model.People

class PeopleRepository(
    private val peopleRemoteDataSource: PeopleRemoteDataSource,
    private val peopleLocalDataSource: PeopleLocalDataSource
): PeopleDataSource {

    override fun getListPeoples(callback: PeopleDataSource.GetPeoplesCallback) {
        peopleLocalDataSource.getListPeoples(
            object : PeopleDataSource.GetPeoplesCallback{
                override fun onPeopleLoaded(data: People) {
                    callback.onPeopleLoaded(data)
                }

                override fun onDataNotAvailable(errorMessage: String) {
                    getPeopleFromRemoteDataSource(callback)
                }

            }
        )
    }

    private fun getPeopleFromRemoteDataSource(callback: PeopleDataSource.GetPeoplesCallback?) {
        peopleRemoteDataSource.getListPeoples(
            object : PeopleDataSource.GetPeoplesCallback{
                override fun onPeopleLoaded(data: People) {
                    peopleLocalDataSource.saveDataPeople(data.peoples)
                    callback?.onPeopleLoaded(data)
                }

                override fun onDataNotAvailable(errorMessage: String) {
                    callback?.onDataNotAvailable(errorMessage)
                }

            }
        )
    }
}