package com.abdalwahab.code_editor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_web_browser.*

class WebBrowser : AppCompatActivity() {

    lateinit var webBrowser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_browser)

        webBrowser = findViewById(R.id.web_brwoser)


        webBrowser.loadData(intent.getStringExtra("code") , "text/html; charset=utf-8", null)



    }
}
