package com.example.w01thefirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //왼족이 부모 클래스임
    override fun onCreate(savedInstanceState: Bundle?) { //fun은 함수 / onCreate - 생성될 때 / 데이터 타입이 Bundle / ?는 널 문자를 넣을 수 있음
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}