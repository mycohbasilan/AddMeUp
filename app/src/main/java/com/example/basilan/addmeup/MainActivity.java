package com.example.basilan.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtFirstNum;
    private EditText mEtSecondNum;
    private TextView mTvResult;
    private Button mTvButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtFirstNum=(EditText)findViewById(R.id.etFirstNum);
        mEtSecondNum=(EditText)findViewById(R.id.etSecondNum);
        mTvResult=(TextView)findViewById(R.id.tvResult);
    }
    public void addNum(View view){
        try {
            double num1, num2, result;
            num1 = Double.parseDouble(mEtFirstNum.getText().toString());
            num2 = Double.parseDouble(mEtSecondNum.getText().toString());
            result = num1 + num2;
            mTvResult.setText(String.valueOf(result));
        }catch (NumberFormatException e){
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }
}
