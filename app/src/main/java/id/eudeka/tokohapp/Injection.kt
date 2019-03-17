package id.eudeka.tokohapp

import android.content.Context
import id.eudeka.tokohapp.data.PeopleRepository
import id.eudeka.tokohapp.data.local.PeopleLocalDataSource
import id.eudeka.tokohapp.data.remote.PeopleRemoteDataSource

class Injection {
    companion object {
        fun providePeopleRepository(context: Context): PeopleRepository {
            return PeopleRepository(PeopleRemoteDataSource(), PeopleLocalDataSource(context))
        }
    }
}