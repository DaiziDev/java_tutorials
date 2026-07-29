import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // Loops
        // For Loops
//        for(int  i = 0; i < 5; i++) {
//            //System.out.println("Hello World");
//        }
//        // While Loops use when we dont know how many times we want to execute a statements
//        int i = 0;
//        while(i > 0 ) {
//            //System.out.println("Hello World" + 1);
//            i--;
//        }
        // practice exemple
        //Scanner scanner = new Scanner(System.in);
       // String input = "";
       // while (!input.equals("quit")) {
            //System.out.println("Input : ");
            //input = scanner.next().toLowerCase();
            //System.out.println(input);
       // }
        // Do while loop similar to while but get executed atleast once
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

        // break and continue
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input :" );
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(!input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        // For each loop in java
        String[] fruits = {"apple", "mango", "orange"};

//        for (int i = fruits.length; i > 0; i--) {
//            System.out.println(fruits[i].toUpperCase());
//        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}