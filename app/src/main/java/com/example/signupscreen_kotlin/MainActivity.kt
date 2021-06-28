package com.example.signupscreen_kotlin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Matcher
import java.util.regex.Pattern

public class MainActivity : AppCompatActivity() {
    private lateinit var email: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var signUpButton: Button
    private lateinit var inputEmail: String
    private var inputPassword: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.id_email)
        password = findViewById(R.id.id_password)
        signUpButton = findViewById(R.id.id_sign_up)
        signUpButton.setOnClickListener {
            inputEmail = email.editText!!.text.toString()
            inputPassword = password.editText!!.text.toString()
            validateEmail(inputEmail!!)
            validatePassword(inputPassword!!)
        }
    }

    private fun validatePassword(inputPassword: String): Boolean {
        val p: Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=()])(?=\\S+\$).{8,20}\$")
        val m: Matcher = p.matcher(inputPassword)
        if (inputPassword == "") {
            password.error = "Field is empty"
            return false
        } else if (!m.matches()) {
            password.error = "not a valid password format"
            return false
        } else {
            password.error = null
            return false
        }
    }


    private fun validateEmail(inputEmail: String): Boolean {
        val p: Pattern = Pattern.compile("^(.+)@(.+)\$")
        val m: Matcher = p.matcher(inputEmail)
        if (inputEmail == "") {
            email.error = "Field is empty"
            return false
        } else if (!m.matches()) {
            email.error = "not a valid email format"
            return false
        } else {
            email.error = null
            return false
        }
    }
}




