package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainnActivity extends AppCompatActivity {
    //1.定义界面上需要的控件对象
    private TextView tvInput;
    private TextView tvResult;
    //需要的变量定义
    private String express;
    private String inputStr;  //存储输入
    private boolean flag;
    private Object view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        //2.获取界面的控件对象
        tvInput = findViewById(R.id.tv_input);
        tvResult = findViewById(R.id.tv_result);

        flag = false;
        express = "";
        inputStr = "";

//        public void calculate (View view){
//            Button button = (Button) view;
//            if (flag) {
//                inputStr = "";
//                tvInput.setText(inputStr);
//                tvResult.setText("0");
//                flag = !flag;
//            }
//            switch (view.getId()) {
//                case R.id.btn0:
//                case R.id.btn00:
//                case R.id.btn1:
//                case R.id.btn2:
//                case R.id.btn3:
//                case R.id.btn4:
//                case R.id.btn5:
//                case R.id.btn6:
//                case R.id.btn7:
//                case R.id.btn8:
//                case R.id.btn9:
//                case R.id.btn_c:
//                case R.id.btnAdd:
//                    inputStr += button.getText().toString();
//                    express += button.getText().toString();
//                    break;
//                case R.id.btnEqual:
//                    inputStr += button.getText().toString();
//                    express += "*";
//                    break;
//                case R.id.btnDel:
//                    inputStr += button.getText().toString();
//                    express += "/";
//                    break;
//                case R.id.btn_c:
//                    inputStr = "";
//                    express = "";
//                    break;
//                case R.id.btnAdd:
//                    if (inputStr.length() > 0) {
//                        inputStr = inputStr.substring(0, inputStr.length() - 1);
//                        express = express.substring(0, express.length() - 1);
//
//                        break;
//                        case R.id.btnPer:
//                            if (tvResult.length() > 0) {
//                                long temp = Long.parseLong(tvResult.getText().toString());
//                                tvResult.setText(String.valueOf(temp * 0.01));
//
//                            }

//                            break;
//                            tvInput.setText(inputStr);
//
//
//            }

//        }
    }
}