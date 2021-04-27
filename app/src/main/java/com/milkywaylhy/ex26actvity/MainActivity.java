package com.milkywaylhy.ex26actvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
        //second activity class를 실행
        Intent intent= new Intent(this,secondActivity.class);
        startActivity(intent);

        //이 액티비티(main activity)를 종료
        finish();

    }

    public void clickBtn02(View view) {
        //서드 액티비티 실행
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }
}