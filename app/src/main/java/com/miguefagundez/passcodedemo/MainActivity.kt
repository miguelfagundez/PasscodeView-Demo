package com.miguefagundez.passcodedemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import com.hanks.passcodeview.PasscodeView
import kotlinx.android.synthetic.main.activity_main.*

const val PASSCODE_LENGTH = 4

class MainActivity : AppCompatActivity() {

    lateinit var passcodeView2 : PasscodeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        passcodeView2 = findViewById(R.id.passcodeView)
        setupPasscode()
    }

    private fun setupPasscode() {
        passcodeView2.setPasscodeLength(PASSCODE_LENGTH)
            .setLocalPasscode("1234")
            .setListener(object : com.hanks.passcodeview.PasscodeView.PasscodeViewListener{
                override fun onFail() {
                    Toast.makeText(applicationContext, "Fail", Toast.LENGTH_SHORT).show()
                }

                override fun onSuccess(number: String?) {
                    Toast.makeText(applicationContext, "Success", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)
                }

            })
    }

}

