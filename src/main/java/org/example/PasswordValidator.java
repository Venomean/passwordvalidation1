package org.example;

import java.util.Arrays;
import java.util.List;

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

    public static boolean containsUpperAndLowerCase(String password) {
        if (password == null) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }

            if (hasUpperCase && hasLowerCase) {
                return true;
            }
        }

        return false;
    }
    public static final List<String> COMMON_PASSWORDS = Arrays.asList(
            "Password1",
            "Aa345678",
            "12345678Aa",
            "Admin123",
            "Computer123",
            "Passwort2"

    );

    public static boolean isCommonPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        return COMMON_PASSWORDS.contains(password);
    }
}


