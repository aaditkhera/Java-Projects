import java.util.Scanner;


public class Areaofrect {
    public static void main(String[] args){
         

         double width = 0;
         double length = 0;
         double area = 0;

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the Width: ");
         width = scanner.nextDouble();

         System.out.print("Enter the length: ");
         length = scanner.nextDouble();

         area = width * length ;
        System.out.println("The area is: " + area);

         scanner.close();
         }

       
        
    }
