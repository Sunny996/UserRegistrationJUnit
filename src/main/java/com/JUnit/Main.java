package com.JUnit;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(Pattern.matches(userRegistration.firstName, "Akash"));
        System.out.println(Pattern.matches(userRegistration.lastName, "Satla"));
    }
}