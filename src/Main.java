import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Switch Statements
         String role = "sdf";
         switch (role) {
             case "admin":
                 System.out.println("Admin");
                 break;
             case "moderator":
                 System.out.println("Moderator");
                 break;
             default:
                 System.out.println("Invalid role");
         }
    }
}