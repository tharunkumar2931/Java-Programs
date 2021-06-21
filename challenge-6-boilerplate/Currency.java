import java.util.Scanner;
public class Currency{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source currency 1.USD,2.GBP,3.JPY,4.EUR,5.AED");
        int source=sc.nextInt();
        System.out.println("Enter the amount");
        float amount=sc.nextFloat();
        switch(source)
        {
            case 1:{
                System.out.println("The amount converted from USD to INR:"+amount*74.3);
                break;
            }
            case 2:{
                System.out.println("The amount converted from GBP to INR:"+amount*94.5);
                break;
            }
            case 3:{
                System.out.println("The amount converted from JPY to INR:"+amount*0.67);
                break;
            }
            case 4:{
                System.out.println("The amount converted from EUR to INR:"+amount*85.37);
                break;
            }
            case 5:{
                System.out.println("The amount converted from AED to INR:"+amount*20.25);
                break;
            }
            
        }
    }
}

