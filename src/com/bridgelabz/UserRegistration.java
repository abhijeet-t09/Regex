package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    void checkFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        System.out.print("Enter Firstname: ");
        String firstName = scanner.next();

        Matcher match = pattern.matcher(firstName);
        if (match.matches())
            System.out.println("Firstname is Valid");
        else
            System.out.println("Invalid Firstname");
    }

    void checkLastName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        Matcher match = pattern.matcher(lastName);
        if (match.matches())
            System.out.println("Last Name is Valid");
        else
            System.out.println("Invalid Last Name");
    }

    void checkEmailId(){
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");

        System.out.println("Enter user email ");
        String emailID = scanner.next();
        String email = scanner.nextLine();

        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email-ID is Valid");
        else
            System.out.println("Invalid Email-ID");
    }

    void checkPhoneNumber(){
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        System.out.println("Enter user Phone number");

        String phoneNumber = scanner.next();

        Matcher match = pattern.matcher(phoneNumber);
        if (match.matches())
            System.out.println("Phone Number is Valid");
        else
            System.out.println("Invalid Phone Number");

    }

    void checkPassword(){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]).{8,}$");
        System.out.println("Enter user Password");

        String password = scanner.nextLine();

        Matcher match = pattern.matcher(password);
        if (match.matches())
            System.out.println("password is Valid");
        else
            System.out.println("password is InValid");
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

//        userRegistration.checkFirstName();
//        userRegistration.checkLastName();
//        userRegistration.checkEmailId();
//        userRegistration.checkPhoneNumber();

        userRegistration.checkPassword();

    }
}
