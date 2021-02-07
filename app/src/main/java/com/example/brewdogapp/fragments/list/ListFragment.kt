package com.example.brewdogapp.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.brewdogapp.R
import com.example.brewdogapp.fragments.list.adapter.BeerListAdapter
import com.example.brewdogapp.model.Beer
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class ListFragment : MvpAppCompatFragment(), IListView {
    @InjectPresenter
    lateinit var mPresenter: ListPresenter

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_list, container, false)
        mRecyclerView = v.findViewById(R.id.list_recycler_view)
        return v
    }

    override fun onResume() {
        super.onResume()
        mPresenter.initList()
    }

    override fun initRecyclerView(list: List<Beer>) {
        val adapter = BeerListAdapter(list)
        mRecyclerView.adapter = adapter
    }

    override fun error(message: String?) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }
}