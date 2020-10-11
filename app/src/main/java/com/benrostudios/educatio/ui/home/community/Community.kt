package com.benrostudios.educatio.ui.home.community

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.benrostudios.educatio.R
import com.benrostudios.educatio.adapters.withSimpleAdapter
import com.benrostudios.educatio.data.premade.posts
import kotlinx.android.synthetic.main.community_fragment.*
import kotlinx.android.synthetic.main.community_item.*
import kotlinx.android.synthetic.main.community_item.view.*

class Community : Fragment() {

    companion object {
        fun newInstance() =
            Community()
    }

    private lateinit var viewModel: CommunityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.community_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CommunityViewModel::class.java)
        // TODO: Use the ViewModel
        loadRecyclerView()
    }

    private fun loadRecyclerView() {
        community_holder.layoutManager = LinearLayoutManager(requireContext())
        community_holder.withSimpleAdapter(posts, R.layout.community_item) { data ->
            itemView.community_username.text = data.username
            itemView.review_community.text = data.review
            itemView.date_community.text = data.date
            itemView.course_community.text = data.course
            itemView.likes_community.text = data.likes.toString()
        }

    }

}