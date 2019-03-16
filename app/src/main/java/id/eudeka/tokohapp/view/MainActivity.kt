package id.eudeka.tokohapp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import id.eudeka.tokohapp.Injection
import id.eudeka.tokohapp.R
import id.eudeka.tokohapp.adapter.PeopleAdapter
import id.eudeka.tokohapp.model.PeopleDetail
import id.eudeka.tokohapp.navigator.PeopleNavigator
import id.eudeka.tokohapp.viewmodel.PeopleViewModel
import kotlinx.android.synthetic.main.activity_people.*

class MainActivity : AppCompatActivity(), PeopleNavigator {

    private lateinit var peopleViewModel: PeopleViewModel
    private lateinit var peopleAdapter: PeopleAdapter
    private var peoples: MutableList<PeopleDetail> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)

        peopleViewModel = PeopleViewModel(Injection.providePeopleRepository(this), this)
        peopleViewModel.setNavigator(this)
        peopleViewModel.getListPeople()

        initAdapter()
    }

    private fun initAdapter() {
        peopleAdapter = PeopleAdapter(peoples)
        rv_list_people.layoutManager = LinearLayoutManager(this)
        rv_list_people.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rv_list_people.adapter = peopleAdapter
    }

    override fun loadListPeople(listPeople: MutableList<PeopleDetail>) {
        peoples.addAll(listPeople)
        runOnUiThread({
            kotlin.run {
                peopleAdapter.notifyDataSetChanged()
            }
        })
    }

    override fun errorLoadPeople(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }
}
