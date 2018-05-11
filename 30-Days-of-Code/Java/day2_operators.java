import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        System.out.println("The total meal cost is " + totalCost(meal_cost, tip_percent, tax_percent) + " dollars.");
    }

    public static int totalCost(double mealCost, int tipPercent, int taxPercent) {
        double tip = (double) (12 * tipPercent) / 100;
        double tax = (double) (12 * taxPercent) / 100;
        int result = (int) Math.round(mealCost + tip + tax);
        return result;
    }
}
