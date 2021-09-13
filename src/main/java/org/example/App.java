/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.*;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Prompting for a quote*/
        System.out.println("What is the quote?");
        String quote = scan.nextLine();


        /*Prompting for an author*/
        System.out.println("Who said it?");
        String author = scan.nextLine();

        /*Printing the quotation and author*/
        System.out.println(author + " says, "  +quote);
    }
}
