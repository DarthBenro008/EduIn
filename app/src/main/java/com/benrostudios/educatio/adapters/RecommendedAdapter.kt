package com.benrostudios.educatio.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.benrostudios.educatio.R
import com.benrostudios.educatio.data.models.Course
import com.benrostudios.educatio.data.premade.colors
import com.github.islamkhsh.CardSliderAdapter
import kotlinx.android.synthetic.main.course_recommended_item.view.*

class RecommendedAdapter(private val list: List<Course>) :
    CardSliderAdapter<RecommendedAdapter.CourseViewHolder>() {


    class CourseViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val title = v.title_rec
        val price = v.price_rec
        val desc = v.desc_rec
        val buyRec = v.buy_rec
        val domainContainer = v.domain_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val v: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.course_recommended_item, parent, false)
        return CourseViewHolder(v)
    }

    override fun getItemCount(): Int = list.size

    override fun bindVH(holder: CourseViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.price.text = "$${list[position].price}"
        holder.desc.text = list[position].desc
        holder.domainContainer.setCardBackgroundColor(colors.random().toColorInt())
    }

}