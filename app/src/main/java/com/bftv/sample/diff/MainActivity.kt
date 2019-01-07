package com.bftv.sample.diff

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.util.DiffUtil
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var mOldList = arrayOf("c", "b")

    private var mNewList = arrayOf("d", "a")

    private lateinit var mDiffCallback: SampleDiffCallback

    private lateinit var mUpdateCallback: SampleUpdateCallback

    private lateinit var mDiffResult: DiffUtil.DiffResult

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mDiffCallback = SampleDiffCallback(mOldList.toList(), mNewList.toList())
        mDiffResult = DiffUtil.calculateDiff(mDiffCallback!!)
        mUpdateCallback = SampleUpdateCallback()
        mDiffResult.dispatchUpdatesTo(mUpdateCallback)


        var data = ArrayList<String>()
        for (i in 1..10000){
            data.add("item$i")
        }
        rv.adapter = DiffAdapter(data)
        rv.layoutManager = GridLayoutManager(this, 4)

    }

}
