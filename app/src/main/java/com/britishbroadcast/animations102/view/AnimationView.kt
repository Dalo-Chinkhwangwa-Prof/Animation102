package com.britishbroadcast.animations102.view

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.britishbroadcast.animations102.R

class AnimationView(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {


    private val waldo = BitmapFactory.decodeResource(context.resources, R.drawable.waldo)
    private val paint = Paint()

    private var xDirection = 0f
    private var yDirection = 0f

    private var xSpeed = 5f
    private var ySpeed = 5f

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        
        if(xDirection > (width - waldo.width) || xDirection < 0)
            xSpeed *= -1

        if(yDirection > (height - waldo.height) || yDirection < 0)
            ySpeed *= -1

        xDirection += xSpeed
        yDirection += ySpeed

        canvas.drawBitmap(waldo,  xDirection,yDirection, paint)
        invalidate()

    }
}