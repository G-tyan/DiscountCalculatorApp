package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//以下(class MailActivity)がアクティビティ生成時に呼ばれるコールバックメソッド

class MainActivity : AppCompatActivity() {

    //onCreate()がコールバックメソッド、初期設定を行う

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
