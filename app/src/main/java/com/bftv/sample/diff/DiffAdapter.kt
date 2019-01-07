package com.bftv.sample.diff

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * @title
 * @description
 * @company 北京奔流网络信息技术有线公司
 * @author cfp
 * @version 1.0
 * @created 2019/01/02
 * @changeRecord [修改记录] <br/>
 */
class DiffAdapter(private val mData: List<String>) : RecyclerView.Adapter<DiffAdapter.DiffViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiffViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_diff_layout, parent, false)
        return DiffViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: DiffViewHolder, position: Int) {
        holder.img.setImageResource(R.mipmap.ic_launcher)
//        holder.tv.text = mData[position]
    }


    class DiffViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img: ImageView = itemView.findViewById(R.id.img)
//        var tv: TextView = itemView.findViewById(R.id.tv)
    }
}