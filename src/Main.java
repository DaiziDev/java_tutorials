import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        User u = new User();
        u.name = "Caleb";
        u.membership = "Gold";

        User u2 = new User();
        u2.name = "Sally";
        u2.membership = "Silver";

        System.out.println(u.name);
        System.out.println(u2.name);
    }
}