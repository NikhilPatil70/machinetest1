package com.example.machinetest1;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog {
    TextView text1,text2;
    RadioButton btn1,btn2;
    Context context;
    String string1;
    CheckBox checkBox;
    public CustomDialog(@NonNull Context context,String mainActivityEditText) {
        super(context);
        this.context=context;
        string1=mainActivityEditText;
        setContentView(R.layout.custom_dialog);
        initViews();
        text1.setText(string1);
        initListener();

    }
    public void initViews()
    {
        text1=findViewById(R.id.Text1);
        text2=findViewById(R.id.Text2);
        btn1=findViewById(R.id.Radio1);
        btn2=findViewById(R.id.Radio2);
        checkBox=findViewById(R.id.check);
    }
    public void initListener()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(string1.toUpperCase());

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(string1.toLowerCase());

            }
        });
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReverseString=" ";
                TextView textView = findViewById(R.id.Text2);
                String userString = textView.getText().toString();
                char []EnterString = userString.toCharArray();
                for(int count=EnterString.length-1;count>=0;count--){

                    ReverseString = ReverseString+EnterString[count];
                }
                textView.setText(ReverseString);
            }
        });

    }

}
