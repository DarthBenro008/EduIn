package com.benrostudios.educatio.ui.home.marketplace

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.benrostudios.educatio.R
import com.benrostudios.educatio.adapters.RecommendedAdapter
import com.benrostudios.educatio.adapters.withSimpleAdapter
import com.benrostudios.educatio.data.premade.courses
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.community_item.*
import kotlinx.android.synthetic.main.course_item.*
import kotlinx.android.synthetic.main.course_item.view.*
import kotlinx.android.synthetic.main.fragment_marketplace.*

class Marketplace : Fragment() {

    private lateinit var adapter: RecommendedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_marketplace, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadCourses()
        loadRecommendedCourses()
    }

    @SuppressLint("SetTextI18n")
    private fun loadCourses() {
        course_recycler.layoutManager = LinearLayoutManager(requireContext())
        course_recycler.withSimpleAdapter(courses, R.layout.course_item) { data ->
            itemView.title_course.text = data.title
            itemView.author_course.text = data.author
            itemView.desc_course.text = data.desc
            itemView.price_course.text = "$${data.price}"
            itemView.rating_course.text = data.rating.toString()
            Glide.with(requireActivity())
                .load(data.image)
                .into(itemView.course_imageView)
        }

    }

    private fun loadRecommendedCourses() {
        adapter = RecommendedAdapter(courses)
        card_slider_domains.adapter = adapter
    }

}