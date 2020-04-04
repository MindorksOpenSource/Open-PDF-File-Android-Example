package com.mindorks.example.openpdffile

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.example.openpdffile.utils.FileUtils
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView.webViewClient = WebViewClient()
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        val url = FileUtils.getPdfUrl()
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
    }
}
