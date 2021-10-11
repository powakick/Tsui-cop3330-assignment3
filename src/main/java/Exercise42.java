package Exercise42;/*
        UCF COP3330 FALL 2021 ASSIGNMENT 42 SOLUTION
        COPYRIGHT 2021 Jonathan Tsui
        */
/*psuedo code:
Read in file name
print out LAST FIRST and SALARY with 16 spaces inbetween
print out line below it
while(nextline)
split between each , as each , is inbetween each variable
and output along the 16 space gap  for each line
 */
import java.io.*;
import java.util.Scanner;

public class Exercise42{

    public static void main(String args[]) throws IOException {
        File file = new File("src/exercise42_input.txt");
        Scanner scan = new Scanner(file);

        System.out.printf("%-16s%-16s%-16s\n","Last","First","Salary");

        System.out.printf("------------------------------------------\n");
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String[] temp = str.split(",");
            System.out.printf("%-16s%-16s%-16s\n", temp[0], temp[1], temp[2]);
        }


    }
}
