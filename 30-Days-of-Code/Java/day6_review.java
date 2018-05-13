import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    scan.nextLine();
    String[] lines = new String[i];

    for(int j = 0; j<i; j++){

        lines[j] = scan.nextLine();
        char[] characters = lines[j].toCharArray();

        for (int k=0; k<lines[j].length(); k+=2){
            System.out.print(characters[k]);
        }
        System.out.print(" ");

        for (int k=1; k<lines[j].length(); k+=2){
            System.out.print(characters[k]);
        }
        System.out.println();
    }
    scan.close();
  }
}
