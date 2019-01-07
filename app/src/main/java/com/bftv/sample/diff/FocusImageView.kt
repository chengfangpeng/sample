package com.bftv.sample.diff

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.widget.ImageView

/**
 * @title
 * @description
 * @company 北京奔流网络信息技术有线公司
 * @author cfp
 * @version 1.0
 * @created 2019/01/02
 * @changeRecord [修改记录] <br/>
 */
class FocusImageView(context: Context?, attrs: AttributeSet?) : ImageView(context, attrs) {


    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        if(gainFocus){
            scaleX = 1.1f
            scaleY = 1.1f
        }else{
            scaleX = 1.0f
            scaleY = 1.0f
        }

    }
}