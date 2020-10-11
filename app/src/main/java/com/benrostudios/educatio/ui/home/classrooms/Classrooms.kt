package com.benrostudios.educatio.ui.home.classrooms

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.benrostudios.educatio.R
import com.benrostudios.educatio.adapters.withSimpleAdapter
import com.benrostudios.educatio.data.premade.courses
import com.benrostudios.educatio.data.premade.generateCourses
import kotlinx.android.synthetic.main.classroom_item.*
import kotlinx.android.synthetic.main.classroom_item.view.*
import kotlinx.android.synthetic.main.classrooms_fragment.*

class Classrooms : Fragment() {

    companion object {
        fun newInstance() = Classrooms()
    }

    private lateinit var viewModel: ClassroomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.classrooms_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ClassroomsViewModel::class.java)
        // TODO: Use the ViewModel
        loadClassrooms()
    }

    private fun loadClassrooms() {
        classroom_recycler.layoutManager = LinearLayoutManager(requireContext())
        classroom_recycler.withSimpleAdapter(
            generateCourses(courses),
            R.layout.classroom_item
        ) { data ->
            itemView.classroom_display_item_title.text = data.course.title
            itemView.classroom_display_item_author.text = data.course.author
        }

    }


}