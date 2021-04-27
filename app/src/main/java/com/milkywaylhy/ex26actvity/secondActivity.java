package com.milkywaylhy.ex26actvity;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    //이 액티비티가 실행되면 자동으로 실행되는 콜백메소드
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        //제목줄 (ACtionBar)관리객체 얻어오기
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Second 화면");

    }
}
