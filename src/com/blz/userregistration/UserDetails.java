package com.blz.userregistration;
import java.util.Scanner;

public class UserDetails extends Regex {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_id, phone_number, password, check_mail;


    public static void main(String[] args) {
        UserDetails details = new UserDetails();
        details.firstname();

    }

    public static void firstname() {
        System.out.println("\nEnter the first name with first latter capital and name should be minimum 3 letters: ");
    }
}
