import java.util.Scanner;
public class ArithmeticCalculator {
    Main ma=new Main();
    double[] value=ma.userInputForArithemtic();
    public void arithmeticOptions(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Select an Arithmetic Operation:"+"\n"+"1.Add"+"\n"+"2.Subtract"+"\n"+"3.Multiply"+"\n"+"4.Divide"+"\n"+"5.Modulo"+"\n"+"6.Back to Main menu");
        int optionOfUser=sc.nextInt();
        switch(optionOfUser)
        {
            case 1:
                 add();
                 break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                modulo();
                break;
            case 6:
                Main m=new Main();
                m.userChoice();
                break;

        }
        sc.close();
    }
     public void add(){
         double a=0,b=0;
         for(int i=0;i<value.length;i++)
         {
             if(i==0)
             {
                 a=value[i];
             }
             if(i==1)
             {
                 b=value[i];
             }
       }
       System.out.println("Addition of two numbers:"+(a+b));
       arithmeticOptions();
    }
    public void subtract(){
        double a=0,b=0;
        for(int i=0;i<value.length;i++)
        {
            if(i==0)
            {
                a=value[i];
            }
            if(i==1)
            {
                b=value[i];
            }
      }
      System.out.println("Subtraction of two numbers:"+(a-b));
      arithmeticOptions();
   }
   public void multiply(){
    double a=0,b=0;
    for(int i=0;i<value.length;i++)
    {
        if(i==0)
        {
            a=value[i];
        }
        if(i==1)
        {
            b=value[i];
        }
  }
  System.out.println("Multiply of two numbers:"+(a*b));
  arithmeticOptions();
}
public void divide(){
    double a=0,b=0;
    for(int i=0;i<value.length;i++)
    {
        if(i==0)
        {
            a=value[i];
        }
        if(i==1)
        {
            b=value[i];
        }
  }
  try{
      if(b!=0.0)
      {
          System.out.println("Division of two numbers"+(a/b));
      }
      else
      {
          throw( new ArithmeticException());
      }
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Exception please enter b value non zero");
        value=ma.userInputForArithemtic();
    }
    arithmeticOptions();
}
public void modulo(){
    double a=0,b=0;
    for(int i=0;i<value.length;i++)
    {
        if(i==0)
        {
            a=value[i];
        }
        if(i==1)
        {
            b=value[i];
        }
  }
  try{
    if(b!=0.0)
    {
        System.out.println("Modulo of two numbers"+(a/b));
    }
    else
    {
        throw( new ArithmeticException());
    }
  }
  catch(ArithmeticException e)
  {
      System.out.println("Arithmetic Exception please enter b value non zero");
      value=ma.userInputForArithemtic();
  }
  arithmeticOptions();
}
}
  






    

