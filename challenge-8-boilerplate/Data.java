import java.util.Scanner;
public class Data{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double result,profit,paid,stock;
        System.out.println("Enter the amount invested by the company");
        int amount=sc.nextInt();
        System.out.println("Enter the share price of the company");
        int price=sc.nextInt();
        result=amount*74.3;
        System.out.println("Investment amount after increase in exchange rate :"+ result);
        stock=((74.3*price)/40);
        System.out.println("New stock price is:" + stock);
        paid=result/10;
        System.out.println("The tax to be paid on the total shares at 10% :"+paid);
        profit=(result-paid);
        System.out.println("The total profit in INR :"+profit);
        System.out.println("The total profit converted to dollars :"+profit/74.3 );
    }
}