/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex15;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner username = new Scanner(System.in);
        System.out.print("What is the username? ");
        String usernameS = username.nextLine();

        Scanner password = new Scanner(System.in);
        System.out.print("What is the password? ");
        String passwordS = password.nextLine();

        if(passwordS.equals("abc$123")){
            System.out.format("Welcome!");
        } else {
            System.out.format("I don't know you.");
        }
    }
}