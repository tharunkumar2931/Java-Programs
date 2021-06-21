import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Main m=new Main();
        m.userChoice();
    }
    public void userChoice(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation you wish to perform:"+"\n"+"1.Mathematical Operation"+"\n"+"2.Scientific Calculator"+"\n"+"3.Exit");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
               ArithmeticCalculator ac=new ArithmeticCalculator();
               ac.arithmeticOptions();
               break;
            case 2:
                ScientificCalculator sf=new ScientificCalculator();
                sf.scientificOptions();
                break;
            case 3:
            break;
        }
    }
    public double[] userInputForArithemtic(){
        String[] value=new String[2];
        double[] inputValue=new double[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b numbers:");
        for(int i=0;i<value.length;i++)
        {
            value[i]=sc.next();
            if(i==0)
            {
                try{
                    inputValue[i]=Double.parseDouble(value[i]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("You entered String,Please enter numbers");
                    userInputForArithemtic();
                }
            }
        
           if(i==1)
            {
             try{
                  inputValue[i]=Double.parseDouble(value[i]);
               }
               catch(NumberFormatException e)
               {
                System.out.println("You entered String,Please enter the number");
               }
            }
        }
      return inputValue;
   }
}








    



       