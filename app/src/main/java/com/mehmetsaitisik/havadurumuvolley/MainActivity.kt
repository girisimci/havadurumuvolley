package com.mehmetsaitisik.havadurumuvolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var request=StringRequest(Request.Method.GET,"http://www.google.com",object :Response.Listener<String>{
            override fun onResponse(response: String?) {
            Toast.makeText(this@MainActivity,"CEVAP"+response,Toast.LENGTH_SHORT).show()
            }

        },object :Response.ErrorListener{
            override fun onErrorResponse(error: VolleyError?) {

            }

        })
    MySingleton.getInstance(this)
    }
}
