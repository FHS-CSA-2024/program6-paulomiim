//import stuff here!
import java.util.Scanner; //import scanner
//Your code here
public class Program6 {
    public static void main (String [] args) {
        //declare variables
        final double pi = 3.14159;
        double r = 0;
        double d = 0;
        double a = 0;
        double c = 0;
        
        //create scanner
        Scanner numScanner = new Scanner (System.in);
        
        
        //user input
        System.out.println("Enter the radius: ");
        r = numScanner.nextDouble();
        
        
        //calculations
        d = r * 2;
        a = (pi) * (r * r);
        c = 2*pi*r;
        
        //remove decimals
        //radius
        r = r * 1000;
        r = r + 0.5;
        r = (int)r;
        r = r / 1000.0;
        
        //diameter
        d = d * 1000;
        d = d + 0.5;
        d = (int)d;
        d = d / 1000.0;
        
        //area
        a = a * 1000;
        a = a + 0.5;
        a = (int)a;
        a = a / 1000.0;
        
        //circumference
        c = c * 1000;
        c = c + 0.5;
        c = (int)c;
        c = c / 1000.0;
        
        
        //print results
        System.out.println("The Radius of the circle = " + r);
        System.out.println("The Diameter of the circle = " + d);
        System.out.println("The Area of the circle = " + a);
        System.out.println("The Circumference of the circle = " + c);
        
        
        
        
    }
}
//Paste console output below:
/*
Enter the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323


*/
