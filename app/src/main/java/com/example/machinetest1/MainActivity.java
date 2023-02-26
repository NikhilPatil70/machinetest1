package com.example.machinetest1;



import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText info;
    private Button Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListener();
    }

    private void initViews() {
        info = findViewById(R.id.editText1);
        Click = findViewById(R.id.OpenDialog1);
    }

    private void initListener() {
        Click.setOnClickListener(view -> {
            CustomDialog customDialog = new CustomDialog(this, info.getText().toString());
            customDialog.show();
        });
    }


}