package com.blz.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public static String regex;


    public static void name(String name) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("\nYour name " + name + " is in the correct format.");

        }else {
            System.out.println("\nYour name is not in format.");
            if (name.equals(UserDetails.first_name)) {
                UserDetails.firstname();
            } else if (name.equals(UserDetails.last_name)) {
                UserDetails.lastname();
            }
        }
    }
    public  static void mail(String mailId) {
        regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailId);
        if (matcher.matches()) {
            System.out.println("\nyour mailID  " + mailId + " is in correct format. ");

        }else {
            System.out.println("\nYour mailId is not in format.");
            UserDetails.mail(mailId);
        }
    }
    public static void phoneNumber(String phoneNumber) {
        regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("\nYour phone number " + phoneNumber + " is in the correct format.");

        }else {
            System.out.println("\nYour phone number is not in format.");
            UserDetails.phoneNumber(phoneNumber);
        }
    }
    public static void password(String password) {
        regex = "^(?=.*[0-9])(?=.*[a-z](?=.*[A-Z]).{8,}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("\nyour password "+ password + " is in correct format.");

        }else {
            System.out.println("\n Your password is not in format");
            UserDetails.password(password);

        }
    }

}
