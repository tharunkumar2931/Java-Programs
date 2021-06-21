import java.util.Scanner;
public class Calender
{
    public static void main(String[] args) {
        int month,year,dayOfWeek;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month1(Jan 2.Feb 3.March 4.April 5.May 6.June 7.July 8.Augest 9.September 10.October 11.November 12.December");
        month=sc.nextInt();
        System.out.println("Enter the year");
        year=sc.nextInt();
        System.out.println("Enter Day of week(1.Monday,2.Tuesday,3.Wednesday,4.Thursday,5.Friday,6.Saturday,7.Sunday)");
        dayOfWeek=sc.nextInt();
        int days=Calender.daysOfMonth(month,year);
        calenderformat(days,dayOfWeek);
    }
    public static int daysOfMonth(int month,int year)
    {    
        if(year%400==0||year%4!=0||year%100==0)
        {
            return new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }[month - 1];
        }
        else{
            return new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }[month - 1];
        }
    }
    public static void calenderformat(int days,int dayOfWeek)
    {
        int count=1;
        int a[][]=new int[7][7];
        System.out.printf("%s%4s%4s%4s%4s%4s%4s\n","S","M","T","W","Th","F","Sa");
        //**for loop for printing rows */
        for(int i=0;i<7;i++)
        {
            //**for loop for printing columes */
            for(int j=0;j<7;j++)
            {
                if(dayOfWeek!=0)
                {
                    System.out.print("    ");
                    dayOfWeek--;
                }
                else{
                    a[i][j]=count;
                    count=count+1;
                    //** for printing spaces between numbers and printing the numbers */
                    if(a[i][j]<10)
                    {
                        System.out.print(a[i][j]+"   ");
                    }
                    else{
                        System.out.print(a[i][j]+"  ");
                    }
                    if(count>days)
                    {
                        break;
                    }
                }
            }
            if(count>days)
            {
                break;
            }
            System.out.println();
        }
    }
    
}
