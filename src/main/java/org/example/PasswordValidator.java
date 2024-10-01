package org.example;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if(password.length() <8 ) {
            return false;
        }else return true;
    }


}