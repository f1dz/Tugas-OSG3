package id.eudeka.tokohapp.data.remote

import id.eudeka.tokohapp.data.PeopleDataSource
import id.eudeka.tokohapp.model.People
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleRemoteDataSource: PeopleDataSource, Callback<People> {

    private val apiInterface = ApiClient.getClient().create(ApiInterface::class.java)
    private lateinit var callBack: PeopleDataSource.GetPeoplesCallback

    override fun getListPeoples(callback: PeopleDataSource.GetPeoplesCallback) {
        callBack = callback
        val call = apiInterface.getAllPeoples()
        call.enqueue(this)
    }

    override fun onFailure(call: Call<People>, t: Throwable) {
        callBack.onDataNotAvailable(t.localizedMessage)
    }

    override fun onResponse(call: Call<People>, response: Response<People>) {
        response.body()?.let {callBack.onPeopleLoaded(it)}
    }

}