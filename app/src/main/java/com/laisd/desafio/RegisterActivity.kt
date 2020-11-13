package com.laisd.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerBtnRegister = findViewById<Button>(R.id.registerBtnRegister)

        registerBtnRegister.setOnClickListener {
            val registerName = findViewById<TextInputEditText>(R.id.registerTxtEdtName)
            val registerNameLayout = findViewById<TextInputLayout>(R.id.registerTxtLayoutName)
            val registerEmail = findViewById<TextInputEditText>(R.id.registerTxtEdtEmail)
            val registerEmailLayout = findViewById<TextInputLayout>(R.id.registerTxtLayoutEmail)
            val registerPassword = findViewById<TextInputEditText>(R.id.registerTxtEdtPassword)
            val registerPasswordLayout = findViewById<TextInputLayout>(R.id.registerTxtLayoutPassword)
            val registerRepeat = findViewById<TextInputEditText>(R.id.registerTxtEdtRepeat)
            val registerRepeatLayout = findViewById<TextInputLayout>(R.id.registerTxtLayoutRepeat)

            var taSemErro = true

            if (registerName.text.toString().isEmpty()){
                registerNameLayout.error = "Name is required"
                taSemErro = false
            }
            registerName.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    registerNameLayout.error = ""
                }
            })

            if (registerEmail.text.toString().isEmpty()){
                registerEmailLayout.error = "Email is required"
                taSemErro = false
            }
            registerEmail.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    registerEmailLayout.error = ""
                }
            })

            if (registerPassword.text.toString().isEmpty()){
                registerPasswordLayout.error = "Password is required"
                taSemErro = false
            }
            registerPassword.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    registerPasswordLayout.error = ""
                }
            })

            if (registerRepeat.text.toString().isEmpty()){
                registerRepeatLayout.error = "Password confirmation is required"
                taSemErro = false
            }
            registerRepeat.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    registerRepeatLayout.error = ""
                }
            })

            if (!registerRepeat.text.toString().equals(registerPassword.text.toString())){
                registerRepeatLayout.error = "Password mismatch"
                taSemErro = false
            }

            if (taSemErro){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        val topAppBar = findViewById<MaterialToolbar>(R.id.registerTopAppBar)
        topAppBar.setNavigationOnClickListener {
            finish()
        }
    }
}