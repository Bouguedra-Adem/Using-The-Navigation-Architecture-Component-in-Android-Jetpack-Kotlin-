package com.example.tp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProviders

import com.example.tp.dummy.DummyContent
import com.example.tp.dummy.DummyContent.DummyItem
import kotlinx.android.synthetic.main.fragment_fragment_list.*

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the

 */
class fragmentFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fragment_list, container, false)
        return view
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel= ViewModelProviders.of(activity!!).get(ViewModel ::class.java)
         Log.e("viewmodel",viewModel.ville.toString())
        list.layoutManager =LinearLayoutManager(context, LinearLayout.VERTICAL,false)
        list.adapter= MyfragmentRecyclerViewAdapter(viewModel.ville!! as ArrayList<Ville>)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()

    }




}
