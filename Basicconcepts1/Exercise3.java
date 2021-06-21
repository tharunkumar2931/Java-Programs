import java.util.Scanner;
class Exercise3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
System.out.println("Enter an number");
n=sc.nextInt();
for(i=1;i<n;i++)
{
   if(n%i==0)
  {
   sum=sum+i;
   }
}
if(sum==n){
System.out.println("Given number is Perfect number");
}
else{
System.out.println("Given number is not Perfect number");
}
}
}