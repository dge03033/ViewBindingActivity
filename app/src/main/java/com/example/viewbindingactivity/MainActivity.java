package com.example.viewbindingactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbindingactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //inflate : 풀로 붙이다.ㅏ
        //getLayoutInflater mbingding 객체에 현재 layout연동된 inflate객체를 연결
        //bing 객체에다가 현재의 루트를 연결
        View view = mBinding.getRoot();
        //view라는 친구에 mBinding을 이용해서 inflate 한 객체를 root를 가져와서 뷰에넣어줌.
        setContentView(view);
        //더이상 findId 할필요가없음.
        mBinding.tvHello.setText("홍드로이드안녕세요용요요용!!");
        mBinding.btnHello.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,"안녕하세요!",Toast.LENGTH_SHORT).show();
            }
        });

        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        //FragmentTransaction 이친구를 사용해야만 fragment 체인지가됨...
        ft.replace(R.id.main_frame,new TestFragment());
        //replace main에서 실행이될때.
        ft.commit();
    }
}