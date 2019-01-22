package com.bftv.sample.diff

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.util.DiffUtil
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mOldList = arrayOf("A", "B", "C", "A", "B", "B", "A")

    private var mNewList = arrayOf("C", "B", "A", "B", "A", "C")

    private lateinit var mDiffCallback: SampleDiffCallback

    private lateinit var mUpdateCallback: SampleUpdateCallback

    private lateinit var mDiffResult: DiffUtil.DiffResult

    private lateinit var mAdapter: DiffAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = DiffAdapter(mOldList.toList())
        rv.adapter = mAdapter
        rv.layoutManager = LinearLayoutManager(this)

        btn_diff_update.setOnClickListener {
            updateByDiff(mNewList.toList())
        }

        btn_diff_reset.setOnClickListener {
            updateByDiff(mOldList.toList())
        }

        btn_update.setOnClickListener {
            update(mNewList.toList())
        }

        btn_reset.setOnClickListener {
            update(mOldList.toList())
        }

    }

    private fun updateByDiff(newData: List<String>){
        mDiffCallback = SampleDiffCallback(mAdapter.getData(), newData)
        mDiffResult = DiffUtil.calculateDiff(mDiffCallback!!)
        mAdapter.setData(newData.toList())
        mDiffResult.dispatchUpdatesTo(mAdapter)

    }

    private fun update(newData: List<String>){
        mAdapter.setData(newData)
        mAdapter.notifyDataSetChanged()
        var position = 1
        mAdapter.notifyItemChanged(position)
        mAdapter.notifyItemInserted(position)
        mAdapter.notifyItemRemoved(position)
    }

}
