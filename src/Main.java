import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Math class
        int result = Math.round(1.1F);
        // here we are casting a float to an integer
        int result2 = (int)Math.ceil(1.1F);
        int  result3 = (int)Math.floor(1.1F);
        // random is for double not integer
        int  result4 = (int) Math.round(Math.random() * 100);

        // formating numbers
       //  NumberFormat percent = NumberFormat.getPercentInstance();
        // String results = percent.format(result);
        String results = NumberFormat.getPercentInstance().format(result4);

        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next().trim();
        System.out.println("you name is  " + name);
    }
}