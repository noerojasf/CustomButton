package com.softtek.custombutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class CustomButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout(context, attributeSet, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_button, this, true)
/*        val btn = findViewById<Button>(R.id.btnCustom)
        btn.setBackgroundResource(R.drawable.button_custom)*/
    }


}