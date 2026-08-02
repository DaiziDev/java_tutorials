import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Method overloading
        System.out.println("Hello World!");
        User u = new User("Caleb", "Silver");
        User u2 = new User();

        System.out.println(u.get_name());
        System.out.println(u.get_membership());
    }
}