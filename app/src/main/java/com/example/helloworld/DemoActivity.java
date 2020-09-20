package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class DemoActivity extends AppCompatActivity {
//    private EditText etUsername;
//    private EditText etPassword;
//    private CheckBox cbAutoLogin;
//    private Button btnLogin;

    /**
     * 1.将Activity类与xml布局进行关联：setContenView
     * 2.xml界面控件的初始化
     * 3.设置按钮等的事件监听
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        //2.
//        etUsername = findViewById(R.id.)

    }
}