import java.util.Scanner;
class Exercise8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num1,num2;
System.out.println("Enter first number");
num1=sc.nextInt();
System.out.println("Enter second number");
num2=sc.nextInt();
System.out.println("Enter ur choice 1.+,2.-,3");
char choice=sc.next().charAt();
switch(choice)
{
case 'a':
{
int sum=num1+num2;
System.out.println(sum);
break;
}
case 'b':
{
int sub=num1-num2;
System.out.println(sub);
break;
}
case 'c':
{
int mul=num1*num2;
System.out.println(mul);
break;
}
case 'd':
{
int div=num1/num2;
System.out.println(div);
break;
}
default:
System.out.println("enter a valid input");
}
}
}