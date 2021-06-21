import java.util.Scanner;
public class TemperatureExercise7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int INR=1;
        System.out.format("%s %14s %38s %34s ","Denominations(INR)", "USD", "JPY", "GBP \n");
             double USD=(INR*74.3);
             double JPY=(INR*0.67);
             double GBP=(INR*94.5);
             int INR1=10;
             double USD1=(INR1*74.3);
             double JPY1=(INR1*0.67);
             double GBP1=(INR1*94.5);
             int INR2=20;
             double USD2=(INR2*74.3);
             double JPY2=(INR2*0.67);
             double GBP2=(INR2*94.5);
             int INR3=50;
             double USD3=(INR3*74.3);
             double JPY3=(INR3*0.67);
             double GBP3=(INR3*94.5);
             int INR4=100;
             double USD4=(INR4*74.3);
             double JPY4=(INR4*0.67);
             double GBP4=(INR4*94.5);

            System.out.format("%d %30.1f %40.2f %30.2f \n", INR,USD,JPY,GBP);
            System.out.format("%d %30.1f %40.2f %30.2f \n", INR1,USD1,JPY1,GBP1);
            System.out.format("%d %30.1f %40.2f %30.2f \n", INR2,USD2,JPY2,GBP2);
            System.out.format("%d %30.1f %40.2f %30.2f \n", INR3,USD3,JPY3,GBP3);
            System.out.format("%d %30.1f %40.2f %30.2f \n", INR4,USD4,JPY4,GBP4);
           

        
        System.out.println("Enter the source currency a.USD b.EUR c.JPY");
        char currency=sc.next().charAt(0);
        if(currency=='a')
        {
         System.out.println("Enter the amount");
         int amount=sc.nextInt();
         System.out.println("Enter the source currency to be converted 1.GBP,2.EUR,3.INR,4.JPY");
         int source=sc.nextInt();
         switch(source){
            case 1:
            System.out.println("The amount converted from USD to GBP is" + amount*0.75+"GBP");
            break;
            case 2:
            System.out.println("The amount converted from USD to EUR is" + amount*0.82+"EUR");
            break;
            case 3:
            System.out.println("the amount converted from USD to INR is"+ amount*74.3+"INR");
            break;
            case 4:
            System.out.println("The amount converted from USD to JPY is"+ amount*104.04+"JPY");
         } 
        }
        else if(currency=='b')
        {
            System.out.println("Enter the amount");
            int amount=sc.nextInt();
            System.out.println("Enter the source currency to ne converted 1.GBP,2.JPY,3.INR,4.USD");
            int source=sc.nextInt();
            switch(source){
               case 1:
               System.out.println("The amount converted from EUR to GBP is" + amount*0.91+"GBP");
               break;
               case 2:
               System.out.println("The amount converted from EUR to JPY is" + amount*126.2+"JPY");
               break;
               case 3:
               System.out.println("the amount converted from EUR to INR is"+ amount*89.3+"INR");
               break;
               case 4:
               System.out.println("The amount converted from EUR to USD is"+ amount*1.2+"USD");
            }
        }
        else if(currency=='c')
        {
            System.out.println("Enter the amount");
            int amount=sc.nextInt();
            System.out.println("Enter the source currency to ne converted 1.GBP,2.EUR,3.INR,4.USD");
            int source=sc.nextInt();
            switch(source){
               case 1:
               System.out.println("The amount converted from JPY to GBP is" + amount*0.0072+"GBP");
               break;
               case 2:
               System.out.println("The amount converted from  JPY to EUR is" + amount*0.0079+"EUR");
               break;
               case 3:
               System.out.println("The amount converted from  JPY to INR is"+ amount*0.67+"INR");
               break;
               case 4:
               System.out.println("The amount converted from  JPY to USD is"+ amount*0.0096+"USD");
            }
        }
        else{
            System.out.println("Enter a valid currency");
        }

    }
    
}
