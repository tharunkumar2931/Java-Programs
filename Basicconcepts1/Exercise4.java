import java.util.Scanner;
class Exercise4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num1,num2,num3;
System.out.println("Enter first number");
num1=sc.nextInt();
System.out.println("Enter second number");
num2=sc.nextInt();
System.out.println("Enter third number");
num3=sc.nextInt();
if((num1<num2)&&(num1<num3))
{
System.out.println("Print first number is lowest :"+ num1);
}
else if((num2<num1)&&(num2<num3))
{
System.out.println("Print second number is lowest :"+ num2);
}
else
{
System.out.println("Print third number is lowest :"+ num3);
}
}
}