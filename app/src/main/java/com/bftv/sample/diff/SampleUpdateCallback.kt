package com.bftv.sample.diff

import android.annotation.SuppressLint
import android.support.v7.util.ListUpdateCallback
import android.util.Log

/**
 * @title
 * @description
 * @company 北京奔流网络信息技术有线公司
 * @author cfp
 * @version 1.0
 * @created 2018/12/27
 * @changeRecord [修改记录] <br/>
 */
class SampleUpdateCallback : ListUpdateCallback {

    companion object {
        const val TAG = "Diff.SampleUpdateCallback"
    }

    /**
     * 当item中的内容发生变化时该方法会被回调，它触发的时机是由[SampleDiffCallback.areContentsTheSame]的返回值决定的
     */
    @SuppressLint("LongLogTag")
    override fun onChanged(position: Int, count: Int, payload: Any?) {
        Log.d(TAG, "onChanged position = $position, count = $count")
    }

    @SuppressLint("LongLogTag")
    override fun onMoved(fromPosition: Int, toPosition: Int) {
        Log.d(TAG, "onMoved fromPosition = $fromPosition, toPosition = $toPosition")
    }

    @SuppressLint("LongLogTag")
    override fun onInserted(position: Int, count: Int) {
        Log.d(TAG, "onInserted position = $position, count = $count")
    }

    @SuppressLint("LongLogTag")
    override fun onRemoved(position: Int, count: Int) {
        Log.d(TAG, "onRemoved position = $position, count = $count")
    }
}