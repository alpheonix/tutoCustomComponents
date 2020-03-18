package com.example.customcomponent

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


class BenefitView(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.custom_layout, this)

        val imageView: ImageView = findViewById(R.id.image)
        val textView: EditText = findViewById(R.id.caption)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.MyCustom)
        imageView.setImageDrawable(attributes.getDrawable(R.styleable.MyCustom_image))
        textView.setText(attributes.getString(R.styleable.MyCustom_text))
        textView.setTextColor(attributes.getColor(R.styleable.MyCustom_textColor,0))
        attributes.recycle()

    }
}