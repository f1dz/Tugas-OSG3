package id.eudeka.tokohapp.data.remote

import id.eudeka.tokohapp.data.PeopleDataSource
import id.eudeka.tokohapp.model.People
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleRemoteDataSource: PeopleDataSource, Callback<People> {

    override fun getListPeoples(callback: PeopleDataSource.GetPeoplesCallback) {
        TODO("not implemented") //Silahkan dikerjakan
    }

    override fun onFailure(call: Call<People>, t: Throwable) {
        TODO("not implemented") //Silahkan dikerjakan
    }

    override fun onResponse(call: Call<People>, response: Response<People>) {
        TODO("not implemented") //Silahkan dikerjakan
    }

}