package com.benrostudios.educatio.ui.home.classrooms

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.benrostudios.educatio.R

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
    }

}