import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Encapsulation is that you can inner details. we are going to use getters and setters to practice
        // Getters and setters are methods or functions attach to object that allow us to get access to our attributes
        System.out.println("Hello World!");
        User u = new User();
        u.set_name("Caleb");
        u.membership = "Gold";

        System.out.println(u.get_name());
    }
}