import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Comparison Operators
        //int x = 1;
        //int y = 1;
        //System.out.println(x == y);
        // Logical Operators
        int temperature = -50;
        boolean isWarm = temperature < 25 && temperature > -25; // returns true only if both are true

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible =( hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // if one of the expression is true then the response is true

        // if statement
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("Is a hot day");
//        } else if (temp < 20 && temp > 25) {
//            System.out.println("Beautiful day");
//        } else {
//            System.out.println("cold day");
//        }
        // simplifying if statements
        int income = 120_000;
        boolean hasHighIncomes = (income > 10000);

        // Ternary Operator
        int inco = 120_000;
        String className = inco > 10_000 ? "First" : "Economy";

    }
}