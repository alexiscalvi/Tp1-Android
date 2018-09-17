package com.example.calvi.tp1;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Header extends LinearLayout {

    public Header(Context context) {
        super(context);
    }

    public Header(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        initialize(context, attrs);
    }

    public Header(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs) {
        inflate(context, R.layout.header, this);

        TextView mainTitleTextView = findViewById(R.id.headerTitle);
        TextView subtitleTextView= findViewById(R.id.headerBack);

        if (attrs != null) {
            TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Header, 0, 0);

            String title = array.getString(R.styleable.Header_mainTitle);
            if (title != null) {
                mainTitleTextView.setText(title);
            }

            title = array.getString(R.styleable.Header_backTitle);
            if (title != null) {
                subtitleTextView.setText(title);
            }

            array.recycle();
        }
    }
}
