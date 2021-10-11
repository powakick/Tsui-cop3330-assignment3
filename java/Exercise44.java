/*        UCF COP3330 FALL 2021 ASSIGNMENT 42 SOLUTION
        COPYRIGHT 2021 Jonathan Tsui
        */
/*
main code to get all the variables, as well as directory file.
Make functions for each folder (CSS JSF)
Functions for each
 */

import java.io.*;
import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name, author;
        char CSS = 'n';
        char JSF = 'n';
        System.out.println("Site name: ");
        name=scan.nextLine();

        System.out.println("Author: ");
        author = scan.nextLine();

        System.out.println("Do you want a folder for Java Script? ");
        JSF = scan.next().charAt(0);

        System.out.println("Do you want a folder for CSS? ");
        CSS = scan.next().charAt(0);

        File f = new File("C:\\test.html");






    }
}
