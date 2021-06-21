import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        char ch;
        do
        {
            System.out.println("Enter the Temperature in Degree Celsius");
            float Temperature=sc.nextFloat();
            celsiusToFahrenheit(Temperature);
            System.out.println("\n Do u wish to continue(y/n)");
            ch=sc.next().charAt(0);
        }while(ch=='y');
    }


    public static void celsiusToFahrenheit(float Temperature) {
		float Fahrenheit=(((Temperature*9)/5)+32);
         System.out.println("Temperature(Celsius)="+Temperature +" "+"Temperature(fahrenheit)= "+Fahrenheit);
    }
}
