package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void firstName(){
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

    public void lastName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        Matcher match = pattern.matcher(lastName);
        if (match.matches())
            System.out.println("Last Name is Valid");
        else
            System.out.println("Invalid Last Name");
    }

    public void emailId(){
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user email ");
        scanner.next();
        String email = scanner.nextLine();

        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email-ID is Valid");
        else
            System.out.println("Invalid Email-ID");
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();

        System.out.println();
        userRegistration.lastName();

        System.out.println();
        userRegistration.emailId();;

    }
}
