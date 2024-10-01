package org.example;

public class PasswordValidator {


    public static boolean isValidPassword(String password) {
        if(password.length() <8 ) {
            return false;
        }else return true;
    }

    public static boolean containsDigits(String password1) {
        if (password1 == null) {
            return false;
        }

        for (char c : password1.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }


}