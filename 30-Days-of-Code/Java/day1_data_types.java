import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        int var_int = scan.nextInt();
        double var_double = scan.nextDouble();

        //  String nextLine(): Returns the next line of text, or, if you are in the middle of a line, returns the remainder of the line. Caution: If you are in the middle of a line, nextLine does not return the next line, but instead the remainder of the current line.

        scan.nextLine();
        String var_string = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + var_int);

        /* Print the sum of the double variables on a new line. */
        System.out.println(i + var_double);

        /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
        System.out.println(s + var_string);
        scan.close();
    }
}
