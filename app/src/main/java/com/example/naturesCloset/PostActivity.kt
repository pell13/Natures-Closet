package com.example.naturesCloset

import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.naturesCloset.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText
import io.socket.client.IO
import io.socket.client.Socket
import io.socket.emitter.Emitter
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStream
import java.net.HttpURLConnection
import java.net.URISyntaxException
import java.net.URL
import android.text.Editable

import android.text.TextWatcher
import androidx.viewpager2.widget.ViewPager2
import com.example.naturesCloset.databinding.ActivityPostBinding

class PostActivity : AppCompatActivity(){

    private lateinit var binding: ActivityPostBinding
    private val colorlist: ArrayList<Colors> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}