package id.eudeka.tokohapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.eudeka.tokohapp.R
import id.eudeka.tokohapp.model.PeopleDetail
import kotlinx.android.synthetic.main.item_list_tokoh.view.*

class PeopleAdapter (var listPeople : MutableList<PeopleDetail>) :
    RecyclerView.Adapter<PeopleAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_tokoh, viewGroup, false))
    }

    override fun getItemCount() = listPeople.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindValue(listPeople[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvNamePeople = view.tv_nama_pemain
        val tvGender = view.tv_gender

        fun bindValue(people: PeopleDetail) {
            tvNamePeople.text = people.name
            tvGender.text = people.gender
        }
    }

}