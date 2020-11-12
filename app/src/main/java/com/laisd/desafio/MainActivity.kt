package com.laisd.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtnLogin = findViewById<Button>(R.id.loginBtnLogIn)
        val loginBtnRegister = findViewById<Button>(R.id.loginBtnRegister)

        loginBtnLogin.setOnClickListener {
            val loginEmail = findViewById<TextInputEditText>(R.id.loginTxtEdtEmail)
            val loginEmailLayout = findViewById<TextInputLayout>(R.id.loginTxtLayoutEmail)
            val loginPassword = findViewById<TextInputEditText>(R.id.loginTxtEdtPassword)
            val loginPasswordLayout = findViewById<TextInputLayout>(R.id.loginTxtLayoutPassword)

            var taSemErro = true

            if (loginEmail.text.toString().isEmpty()){
                loginEmailLayout.error = "Email is required"
                taSemErro = false
            }
            loginEmail.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    loginEmailLayout.error = ""
                }
            })

            if (loginPassword.text.toString().isEmpty()){
                loginPasswordLayout.error = "Password is required"
                taSemErro = false
            }
            loginPassword.addTextChangedListener(object: TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    loginPasswordLayout.error = ""
                }
            })

            if (taSemErro) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        loginBtnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}