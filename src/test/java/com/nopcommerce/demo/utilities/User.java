package com.nopcommerce.demo.utilities;

import com.github.javafaker.Faker;

public class User {
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;

    public static void generateUser(){
        firstName = new Faker().name().firstName();
        lastName = new Faker().name().lastName();
        email = new Faker().internet().emailAddress();
        password = new Faker().internet().password();
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }
}
