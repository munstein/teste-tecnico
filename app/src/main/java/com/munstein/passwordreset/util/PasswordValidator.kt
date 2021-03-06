package com.munstein.passwordreset.util

/**
 * Created by @Munstein on 21/02/2018.
 */
class PasswordValidator : IPasswordValidator{

    private val minimumSize = 6

    override fun passwordsAreValid(password: String, newPassword: String): Boolean {
        if(passwordsAreEqual(password,newPassword)){
            if(passwordHasMinimumSize(password) &&
                    passwordHasNumber(password))
                return true
        }
        return false
    }

    override fun passwordHasMinimumSize(password: String): Boolean {
        return password.length >= minimumSize
    }

    override fun passwordsAreEqual(password: String, newPassword: String): Boolean {
        return password == newPassword
    }

    override fun passwordHasNumber(password: String): Boolean {
        return password.matches(Regex(".*\\d+.*"))
    }

}
