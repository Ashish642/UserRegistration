package com.blz.userregistration;
import java.util.Scanner;

public class UserDetails extends Regex {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_id, phone_number, password, check_mail;


    public static void main(String[] args) {
        UserDetails details = new UserDetails();
        details.firstname();
        details.lastname();
        details.mail();
        details.password();
        details.phoneNumber();



    }

    public static void firstname() {
        System.out.println("\nEnter the first name with first latter capital and name should be minimum 3 letters: ");
        first_name = scan.next();
        Regex.name(first_name);

    }
    public static void lastname() {
        System.out.println("\nEnter the last name with first latter capital and name should be minimum 3 letters: ");
        last_name = scan.next();
        Regex.name(last_name);
    }
    public static void mail() {
        System.out.println("\nEnter the mail with following valid format: ");
        System.out.println("\nFormat is E.g. abc.xyz@bl.co.in(In that abc , bl & co is mandatory)");
        mail_id = scan.next();
        Regex.mail(mail_id);
    }
    public static void phoneNumber() {
        System.out.println("\nEnter the phone number with country code and leave gap b/w them (E.g.:91 789540650023):");
        phone_number = scan.next();
        Regex.phoneNumber(phone_number);

    }
    public static void password() {
        System.out.println("\nEnter the password with following rule");
        System.out.println("1. minimum 8 characters\n2.At Least one uppercase\n3.At Least one numerical");
        password = scan.next();
        Regex.password(password);
    }

}
