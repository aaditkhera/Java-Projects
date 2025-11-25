import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius =  scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is " + circumference + " cm");

        area  = Math.PI * Math.pow(radius , 2);
        System.out.println("The area is " + area + " cm^2");

        volume = 4.0/3.0 * Math.PI * Math.pow(radius , 3);
        System.out.println("The Volume is "+ volume + " cm^3");

        scanner.close();

    }
}
