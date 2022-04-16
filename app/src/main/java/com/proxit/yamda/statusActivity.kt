package com.proxit.yamda

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

private const val TAGG = "StatusActivity"
private var  editStatus : TextView? = null
private var  buttonTweet : Button? = null

class statusActivity: AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.status_activity)

        editStatus = findViewById(R.id.editStatus)
         buttonTweet = findViewById(R.id.buttowTweet)

        buttonTweet?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var status : String  = editStatus?.getText().toString()
        Log.e(TAG, "onClicked with Status:$status")
        Toast.makeText(this,status,Toast.LENGTH_SHORT).show()

    }
}