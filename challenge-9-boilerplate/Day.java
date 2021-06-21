import java.util.Scanner;
import java.util.Calender;
public class Day{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current day of the week (1.Monday,2.Tuesday,3.Wednesday,4.Thursday,5.Friday,6.Saturday,7.Sunday)");
        int currentday=sc.nextInt();
        System.out.println("Enter the Number of days from now");
        int number=sc.nextInt();
        int Nextweek=((currentday+number)%7);
        switch(Nextweek)
      {
         case 1:
            System.out.println("Its a Monday");
            break;
         case 2:
            System.out.println("Its a Tuesday");
            break;
         case 3:
            System.out.println("Its a Wednesday");
            break;
         case 4:
            System.out.println("Its a Thursday");
            break;
         case 5:
            System.out.println("Its a Friday");
            break;
         case 6:
            System.out.println("Its a Saturday");
            break;
         case 7:
            System.out.println("Its a Sunday");
            break;
            default:
            System.out.println("Change the number of days from now");
        }
    }

}


