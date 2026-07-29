import java.awt.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primitive variable type for simple values
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        // reference variabl type  for storing complex objects
        Date now = new Date();

        // major difference between primitive and reference type
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        System.out.println(now);
        point1.x = 2;

        System.out.println(point2);
    }
}