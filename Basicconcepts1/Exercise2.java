import java.util.Scanner;
class Exercise2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int  result,num,i;
System.out.println("Enter a number");
num=sc.nextInt();
for(i=1;i<=10;i++){
result=num*i;
}
System.out.println(num +"*"+i+"="+result);
}
}

