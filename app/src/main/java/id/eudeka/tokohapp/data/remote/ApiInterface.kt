package id.eudeka.tokohapp.data.remote

import id.eudeka.tokohapp.model.People
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/people/")
    fun getAllPeoples(): Call<People>
}