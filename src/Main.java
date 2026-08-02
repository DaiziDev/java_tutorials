import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Generic Lists
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("caleb"));
        users.add(new User("You"));
        users.add(new User("Sally"));

        for  (User u : users) {
            System.out.println(u.get_name());
        }

        // static member of a class

    }
}