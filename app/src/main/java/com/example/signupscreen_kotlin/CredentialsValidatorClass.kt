package com.example.signupscreen_kotlin

import java.util.regex.Matcher
import java.util.regex.Pattern

class CredentialsValidatorClass {

    private val EMAIL_PATTERN:Pattern= Pattern.compile("^(.+)@(.+)\$")
    private val PASSWORD_PATTERN:Pattern= Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=()])(?=\\S+$).{8,20}$")


    fun validateInputs(inputEmail:String,inputPassword:String):Boolean{
        val emailMatcher:Matcher=EMAIL_PATTERN.matcher(inputEmail)
        val passwordMatcher:Matcher=PASSWORD_PATTERN.matcher(inputPassword)
        return emailMatcher.matches() && passwordMatcher.matches()
    }
}