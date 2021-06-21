import java.util.Scanner;
public class ScientificCalculator {
    Scanner sc=new Scanner(System.in);
    public void scientificOptions()
    {
        System.out.println("Select an Scientific operation:"+"\n"+"1.Ceil"+"\n"+"2.Floor"+"\n"+"3.Square root"+"\n"+"4.Power of"+"\n"+"5.Back to Main Menu");
        int optionOfUser=sc.nextInt();
        switch(optionOfUser)
        {
            case 1:
                ceil();
                break;
            case 2:
                floor();
                break;
            case 3:
                squareRoot();
                break;
            case 4:
                powerOf();
                break;
            case 5:
            Main m=new Main();
            m.userChoice();
            break;
        }
        sc.close();
    }
    public void ceil(){
        System.out.println("Enter the Decimal value");
        double inputNumber=sc.nextDouble();
        try{
            if(inputNumber!=0)
            {
                System.out.println("The ceil value :"+Math.ceil(inputNumber));
            }
            else{
                throw(new CalculatorException("please enter non zero value"));
            }
        }
        catch(CalculatorException c)
        {
        System.out.println(c);
        ceil();
        }
        scientificOptions();
    }
    public void floor(){
        System.out.println("Enter the decimal value:");
        double inputNumber=sc.nextDouble();
        try{
            if(inputNumber!=0)
            {
                System.out.println("The ceil value:"+Math.floor(inputNumber));
            }
            else{
                throw(new CalculatorException("Please enter non zero value"));
            }
        }
        catch(CalculatorException c)
        {
            System.err.println(c);
            floor();
        }
        scientificOptions();
    }
    public void squareRoot(){
        System.out.println("Enter a non integer value:");
        int a=sc.nextInt();
        try{
            if(a!=0&&a>0){
                System.out.println("The square root of"+a+" is"+Math.sqrt(a));
            }
            else{
                throw(new CalculatorException("Please enter non zero value"));
            }
        }
        catch(CalculatorException e)
        {
            System.out.println(e);
            squareRoot();
        }
        scientificOptions();
    }
    public void powerOf(){
        System.out.println("Enter a non negative integer:");
        int a=sc.nextInt();
        System.out.println("Enter a non negative integer:");
        int b=sc.nextInt();
        try{
            if(a!=0&&b!=0&&a>0&&b>0)
            {
                System.out.println("The value of"+a+"to the power of"+b+"is"+Math.pow(a,b));
            }
            else{
                throw(new CalculatorException("please enter non Zero value"));
            }
        }
        catch(CalculatorException c)
        {
            System.out.println(c);
            powerOf();
        }
        scientificOptions();
    }
}


                    


    

