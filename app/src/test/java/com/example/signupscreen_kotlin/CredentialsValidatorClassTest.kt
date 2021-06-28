package com.example.signupscreen_kotlin

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CredentialsValidatorClassTest{

   lateinit var credentialsValidatorClass:CredentialsValidatorClass

   @Before
   fun setUp(){
       credentialsValidatorClass= CredentialsValidatorClass()
   }
    @Test
    fun ifGivenValidUsernameAndValidPasswordThenReturnTrue(){
        val result:Boolean=credentialsValidatorClass.validateInputs("geo@gmail.com","Tcs@sd232")
        assertEquals(result,true)
    }
    @Test
    fun ifGivenInValidUsernameAndValidPasswordThenReturnFalse(){
        val result:Boolean=credentialsValidatorClass.validateInputs("geogmail.com","Tcs!sd232")
        assertFalse(result)
    }
    @Test
    fun ifGivenInValidUsernameAndInValidPasswordThenReturnFalse(){
        val result:Boolean=credentialsValidatorClass.validateInputs("geogmail.com","Tcssd232")
        assertFalse(result)
    }
}
