package com.example.paohi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by yxp on 2015/9/7.
 */
public class linebt extends LinearLayout {
    private Context context;
    public linebt(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        LayoutInflater.from(context).inflate(R.layout.linebt,this);
    }

    public linebt(Context context) {
        super(context);
        this.context=context;
    }
}