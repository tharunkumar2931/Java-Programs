import java.util.Scanner;
public class Exercise23{
public static void main(String[] args){
    String[][] route=new String[15][];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the cities name with caps and currency ex:USD,GBP,EURO.. and time in 9.00");
    System.out.println("Enter the routes Information");
    for(int i=0;i<15;i++)
    {
        route[i]=sc.nextLine().split(",");// taking the input and spliting and sorting in 2d array
    }
    System.out.format("S.no"+"        FRom "+"       To"+"       Distance in kms"+"        Travel time"+"        Typical Airface"+"\n");
    for(int i=0;i<15;i++)
    {
        System.out.println();
        System.out.println((i+1)+"         "+route[i][0]+"       "+route[i][1]+"        "+route[i][2]+"       "+route[i][3]+"       "+route[i][4]);
        System.out.println();
    }
    System.out.println("Enter the city that you are travelling");// taking the fromcity from which he was travelling
    String fromCity=sc.next();
    showDirectFlights(route,fromCity);
    System.out.println("Enter the city which you want to travel");//taking to city to which he went to travel
    String toCity=sc.next();
    showAllConnections(route,fromCity,toCity);
    sc.close();
}
public static void showAllConnections(String[][] route,String fromCity,String toCity){
    int j=1,n=0,count=0;// counters ,j is to print serial number and n is used as incrementot and used in fromcities for loop as size and count is used for to cites
    String[][] fromCities=new String[15][4];
    String[][] toCities=new String[15][4];
    System.out.format("S.No"+"       From"+"         To"+"        Distance in kms"+"        Travel Time"+"              Typical Airfare"+"\n");
    for(int i=0;i<15;i++)
    {
        if(route[i][0].contains(fromCity)&&route[i][1].contains(toCity))//if it contains both from city and to city it prints that row
        {
            System.out.println(j+"          "+route[i][0]+"       "+route[i][1]+"          "+route[i][2]+"        "+route[i][3]+"            "+route[i][4]);
        }
        j=j+1;
    }
    for (int i = 0; i < 15; i++)
    {
        if(route[i][0].contains(fromCity))// if the row contains from city
        {
            fromCities[n]=route[i];// storing the from cities
            n=n+1;// incrementing
        }
        if(route[i][1].contains(toCity))// ifthe row contains to city
        {
            toCities[i]=route[i];// storing all the to city rows
            count=count+1;
        }
    }
    for(int i=0;i<n;i++)// for each loop
    {
        int s=1;
        for(int h=0;h<count;h++)// for each loop
        {
            if(fromCities[i][1].equals(toCities[h][0]))// if statement for checking the connecting city
            {
                System.out.println(s+"         "+fromCities[i][0]+"       "+fromCities[i][1]+"       "+fromCities[i][2]+"        "+fromCities[i][3]+"         "+fromCities[i][4]);
                System.out.println("          "+toCities[i][0]+"      "+toCities[i][1]+"       "+toCities[i][2]+"       "+toCities[i][3]+"       "+toCities[i][4]);
            }
            s=s+1;
        }
    }
}

    public static void showDirectFlights(String[][] route,String fromCity){
        String[][] temp=new String[5][];
        String[][] directroute=new String[15][];
        int j=1,count=0;// j is used for S.No,count is used in bubble sort as size iterator
        System.out.format("S.No"+"       From"+"         To"+"          Distance in kms"+"          Travel Time"+"          Typical Airface"+"\n");
        for(int i=0;i<15;i++)
        {
          if(route[i][0].contains(fromCity))// chcecking the from city if it contains it prints the row
        {
            System.out.println((j)+"          "+route[i][0]+"        "+route[i][1]+"       "+route[i][2]+"       "+route[i][3]+"      "+route[i][4]);
            directroute[j-1]=route[i];
            j=j+1;
            count=count+1;
        }
    }
    System.out.println(".................Routes are in ascending order................");
    System.out.format("S.No"+"           From"+"          To"+"         Distance in kms"+"          Travel Time"+"         Typical Airfare"+"\n");
    char firstStringChar,SecondStringChar;
    for(int i=0;i<count;i++)// used bubble sort
    {
        for(int k=1;k<(count-1);k++)
        {
            firstStringChar=directroute[k-1][i].charAt(0);//taking the first character of first string
            SecondStringChar = directroute[k][i].charAt(0);// taking the first character of second string
            if(firstStringChar>SecondStringChar)//swapping 
            {
                temp[i]=directroute[k-1];
                directroute[k-1]=directroute[k];
                directroute[k]=temp[i];
            }
        }
    }
        for(int i=0;i<count;i++)
        {
            System.out.println((i+1)+"            "+directroute[i][0]+"          "+directroute[i][1]+"           "+directroute[i][2]+"             "+directroute[i][3]+"          "+directroute[i][4]);
        }
    }
    
}









