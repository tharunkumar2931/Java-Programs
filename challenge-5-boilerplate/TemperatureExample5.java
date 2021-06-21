import java.util.Scanner;
public class TemperatureExample5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        char rc;
        do{
        
            System.out.println("Enter the Temperature");
            float Temperature=sc.nextFloat();
            System.out.println("Enter the scale celsius(c)/fahrenheit(f)");
            ch=sc.next().charAt(0);
            if(ch=='c')
            {
               celsiusToFahrenheit(Temperature);
            }
            if(ch=='f')
            {
               fahrenheitToCelsius(Temperature);
            }
            System.out.println(" do u wish to continue(y)/(n)");
            rc=sc.next().charAt(0);
        }while (rc=='y');
    }
            public static void celsiusToFahrenheit(float Temperature){
              float fahrenheit=(((Temperature*9)/5)+32);
             System.out.println("Temperature(celsius)="+Temperature+"Temperature(fahrenheit)=" +fahrenheit);
            }
            public static void fahrenheitToCelsius(float Temperature){
                float celsius=(((Temperature-32)*5)/9);;
                System.out.println("Temperature(fahrenheit)="+Temperature+"Temperature(celsius)=" +celsius);
            }

}
