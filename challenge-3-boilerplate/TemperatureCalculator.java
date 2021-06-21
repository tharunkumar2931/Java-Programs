 import java.util.Scanner;
public class TemperatureCalculator{
    public static void main(String[]args) {
        char ch;
        do
        { 
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the Temperature in Degree Celsius ");
         float Celsius=sc.nextFloat();
         float Fahrenheit=(((Celsius*9)/5)+32);
         System.out.printf("%s %25s","Celsius"+"="+Celsius,"Fahrenheit"+"="+Fahrenheit);
         System.out.println("\n Do you wish to continue: (y/n)");
         ch=sc.next().charAt(0);
        }while(ch=='y');
    }       
}


  