package com.bftv.sample.diff

import android.support.v7.util.DiffUtil

/**
 * @title
 * @description
 * @company 北京奔流网络信息技术有线公司
 * @author cfp
 * @version 1.0
 * @created 2018/12/27
 * @changeRecord [修改记录] <br/>
 */
class SampleDiffCallback(private var mOldList: List<String>, private var mNewList: List<String>) :
    DiffUtil.Callback() {


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mOldList[oldItemPosition] == mNewList[newItemPosition]
    }

    override fun getOldListSize(): Int {
        return mOldList.size
    }

    override fun getNewListSize(): Int {
        return mNewList.size
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }
}