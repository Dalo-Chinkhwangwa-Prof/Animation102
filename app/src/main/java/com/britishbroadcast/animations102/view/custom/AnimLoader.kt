package com.britishbroadcast.animations102.view.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.britishbroadcast.animations102.R

class AnimLoader(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {

    var loadingText: String
        get() = loaderTextView.text.toString()
        set(value) {
            loaderTextView.text = value
        }

    var loaderTextView: TextView


    private val inflater = /*LayoutInflater.from(context)*/context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    init {
        val view = inflater.inflate(R.layout.custom_loader_layout, this, true)

        loaderTextView = view.findViewById(R.id.load_textview)

        val tArray = context.obtainStyledAttributes(attributeSet,
                R.styleable.AnimLoader)

        loadingText = tArray.getString(R.styleable.AnimLoader_loadingText) ?: ""

    }

}