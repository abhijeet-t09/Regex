package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Firstname: ");
        String firstName = scanner.next();

        Matcher match = pattern.matcher(firstName);
        if (match.matches())
            System.out.println("Firstname is Valid");
        else
            System.out.println("Invalid Firstname");
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
    }
}
