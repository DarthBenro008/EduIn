package com.benrostudios.educatio.ui.classroom

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.benrostudios.educatio.R
import com.benrostudios.educatio.adapters.withSimpleAdapter
import com.benrostudios.educatio.data.premade.sections
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.section_item.*
import kotlinx.android.synthetic.main.section_item.view.*


class Dashboard : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadSections()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    @SuppressLint("SetTextI18n")
    private fun loadSections() {
        section_recyclerr.layoutManager = LinearLayoutManager(requireContext())
        section_recyclerr.withSimpleAdapter(sections, R.layout.section_item) { data ->
            val rand = (1..7).random()
            itemView.section_number.text = "Section Number ${data.id}"
            itemView.section_title.text = data.title
            itemView.section_hours.text = "$rand/${data.hours} hours"
        }

    }
}