public class TemperatureConverter{
public static void main(String[] args){
   int SrNo;
   System.out.format("%s%15s%25s\n","SrNo","Celsius","Fahrenheit");
   int Celsius=0,Fahrenheit;
   for(SrNo=1;SrNo<=11;SrNo++)
   {
      Fahrenheit=(((Celsius*9)/5)+32);
      System.out.format("%d%15d%25d\n",SrNo,Celsius,Fahrenheit);
      Celsius=Celsius+10;
   }
   }
}