package id.eudeka.tokohapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.eudeka.tokohapp.R
import kotlinx.android.synthetic.main.item_list_tokoh.view.*

class PeopleAdapter (val listPeople : Array<String>, val context: Context) :
    RecyclerView.Adapter<PeopleAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_tokoh, p0, false))
    }

    override fun getItemCount(): Int {
        return listPeople.size;
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.tvNamePeople?.text = listPeople.get(p1)
        p0?.tvGender?.text = listPeople.get(p1)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvNamePeople = view.tv_nama_pemain
        val tvGender = view.tv_gender
    }

}