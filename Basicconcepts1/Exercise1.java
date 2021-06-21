import java.util.Scanner;
class Exercise1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double area,r;
System.out.println("Enter a radius");
r=sc.nextInt();
area=3.14*r*r;
System.out.println("Area of circle is "+area);
}
}