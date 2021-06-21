public class Temperature{
public static void main(String[] args){
   int SrNo;
   System.out.format("%s%15s%25s\n","SrNo","Celsius","Fahrenheit");
   float Celsius=0,Fahrenheit;
   for(SrNo=1;SrNo<=101;SrNo++)
   {
      Fahrenheit=(((Celsius*9)/5)+32);
      System.out.format("%d%15.1f%25.1f\n",SrNo,Celsius,Fahrenheit);
      Celsius=Celsius+10;
   }
   }
}