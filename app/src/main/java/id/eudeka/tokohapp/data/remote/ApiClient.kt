package id.eudeka.tokohapp.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object {
        fun getClient(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://swapi.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}