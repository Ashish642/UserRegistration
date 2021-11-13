package com.blz.userregistration;
import java.util.Scanner;

public class UserDetails extends Regex {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_id, phone_number, password, check_mail;


    public static void main(String[] args) {
        UserDetails details = new UserDetails();
        details.firstname();
        details.lastname();


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
}
