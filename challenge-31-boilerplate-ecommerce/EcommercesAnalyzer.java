import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EcommercesAnalyzer {
    public Ecommerces[] readFile(String fileName){
        try {
            int count=0;
            BufferedReader bf=new BufferedReader(new FileReader(fileName));
            String line;
            while((line=bf.readLine())!=null){
                count=count+1;
            }
            String[] temp=new String[7];
            Ecommerces[] ecommerces=new Ecommerces[count];
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String data;
            br.readLine();
            int j=0;
            while(( data=br.readLine())!=null){
                temp=data.split(",");
                Ecommerces s=new Ecommerces();
                try{
                    s.setDate(temp[0]);
                    s.setCustomer_id(Long.valueOf(temp[1]));
                    s.setProduct_category(Integer.valueOf(temp[2]));
                    s.setPayment_method(temp[3]);
                    s.setValue(Float.valueOf(temp[4]));
                    s.setTime_on_site(Float.valueOf(temp[5]));
                    s.setClicks_in_site(Integer.valueOf(temp[6]));
                    ecommerces[j]=s;
                    j++;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    return ecommerces;
    }
    catch(FileNotFoundException n){
    n.printStackTrace();
    return null;
     }
    catch(IOException f){
    f.printStackTrace();
    return null;
        }
    }

	public int[] uniqueNumberProductCategory(Ecommerces[] ecommerces) {
        int[] uniqueNumbers=new int[ecommerces.length];
        String[] temporaryArray=new String[ecommerces.length];
        for(int i=0;i<ecommerces.length-1;i++)
        {
            for(int j=0;j<ecommerces.length-1;j++)
        {
            if(ecommerces[i].getProduct_category()==ecommerces[j].getProduct_category())
            {
                uniqueNumbers[j]=ecommerces[i].getProduct_category();
            }
            if(ecommerces[i].getDate().equals(ecommerces[j].getDate()))
            {
                temporaryArray[j]=ecommerces[i].getDate();
            }
        }
    }
		
    
        System.out.println("The unique value are:");
        EcommercesAnalyzer ea=new EcommercesAnalyzer();
        for(int k=0;k<uniqueNumbers.length-1;k++)
        {
        boolean value=false;
        for(int r=0;r<k;r++)
        {
            if(uniqueNumbers[k]==uniqueNumbers[r])
            {
                value=true;
                break;
            }
        }
        if(value)
        {
            System.out.println(uniqueNumbers[k]);
        }
    }
    System.out.println("Dates in the file");
    for(int k=0;k<temporaryArray.length-1;k++)
    {
        boolean value=false;
        for(int t=0;t<k;t++)
        {
            if(temporaryArray[k].equals(temporaryArray[t])){
                value=true;
                break;
            }
        }
        if(!value){
            System.out.println(temporaryArray[k]);
        }
    }
    return uniqueNumbers;
}
public void highestAndLowestValues(Ecommerces[] ecommerces)
{
    int highestValue=ecommerces[0].getProduct_category();
    int lowsetValue=ecommerces[0].getProduct_category();
    System.out.println("Enter the date for highest and lowest product category");
    Scanner sc=new Scanner(System.in);
    String givenDate=sc.next();
    for(int i=0;i<ecommerces.length-1;i++)
    {
        try{
            if(ecommerces[i].getDate()!=null){
                if(givenDate.equals(ecommerces[i].getDate()))
                {
                    if(ecommerces[i].getProduct_category()>highestValue)
                    {
                        highestValue=ecommerces[i].getProduct_category();
                    }
                    if(ecommerces[i].getProduct_category()<lowsetValue){
                        lowsetValue=ecommerces[i].getProduct_category();
                    }                
                }
            }
        }
        catch(NullPointerException e){
            continue;
        }
    } 
    System.out.println("for"+givenDate+"highest value is"+highestValue);
    System.out.println("for"+givenDate+"lowest value is"+lowsetValue);
    System.out.println("do you want to continue (y/n)");
    char response=sc.next().charAt(0);
    if(response=='y'){
        highestAndLowestValues(ecommerces);
    }
}
public void findingPreferedPayment(Ecommerces[] ecommerces){
    int countOne=0;
    int countTwo=0;
    for(int i=0;i<ecommerces.length;i++)
    {
        try{
            if(ecommerces[i].getDate()!=null)
            {
            if(ecommerces[i].getPayment_method().equals("credit")){
                countOne=countOne+1;
            }
            if(ecommerces[i].getPayment_method().equals("paypal")){
                countTwo=countTwo+1;
            }
        }
    }
    catch(NullPointerException e)
    {
        continue;
    }
}
    if(countOne>countTwo)
    {
       System.out.println("Prefered mode of payment is credit");
    }
    else{
        System.out.println("Prefered mode of payment is paypal");
    }
}
public void findingGeneratingMoreSales(Ecommerces[] ecommerces){
    double totalSalesIn15Minutes=0;
    double totalSalesInLess15Minutes=0;
    for(int i=0;i<ecommerces.length;i++)
    {
        try{
            if(ecommerces[i].getDate()!=null){
                if(ecommerces[i].getTime_on_site()>=15){
                    totalSalesIn15Minutes=totalSalesIn15Minutes+ecommerces[i].getValue();
                }
                else{
                    totalSalesInLess15Minutes=totalSalesInLess15Minutes+ecommerces[i].getValue();
                }
            }
        }
        catch(NullPointerException n){
            continue;
        }
    }
    if(totalSalesIn15Minutes>totalSalesInLess15Minutes){
        System.out.println("spending more then 15 minutes generates less sales");
    }
    else{
        System.out.println("spending less then 15 minutes generates less sales");
    }
}
public void findingMaximumSoldProduct(Ecommerces[] ecommerces,int[] uniquenumber){
    int maximumSoldProduct=0;
    int number=0;
    int count=0;
    int productCategory=0;
    int maxproduct=0;
    for(int i=0;i<ecommerces.length;i++)
    {
        try{
            if(uniquenumber[i]!=0)
            {
                number=uniquenumber[i];
            }
            if(number==ecommerces[i].getProduct_category()){
                count=count+1;
                productCategory=ecommerces[i].getProduct_category();
            }
        }
        catch(NullPointerException e){
            continue;
        }
        if(count>maximumSoldProduct){
            maximumSoldProduct=count;
            maxproduct=productCategory;
        }
    }
    System.out.println("Category of the product which was sold the maximum no of times is"+maxproduct);
}
public void findingMaximumAmountByProductCategory(Ecommerces[] ecommerces,int[] uniquenumber){
    float maximumSoldProduct=0;
    int number=0;
    float count=0;
    int productCategory=0;
    int maxproduct=0;
    for(int i=0;i<ecommerces.length;i++)
    {
        try{
            if(uniquenumber[i]!=0)
            {
                number=uniquenumber[i];
            }
            if(number==ecommerces[i].getProduct_category()){
                count=count+ecommerces[i].getValue();
                productCategory=ecommerces[i].getProduct_category();
            }
        }
        catch(NullPointerException n){
            continue;
        }
        if(count>maximumSoldProduct){
            maximumSoldProduct=count;
            maxproduct=productCategory;
        }
    }
    System.out.println("product_category which has generated the maximum amount of total sales is"+maxproduct);
}
public void averageClicks(Ecommerces[] ecommerces){
    int averageNumberOfClicks=0;
    int count=0;
    for(int i=0;i<ecommerces.length;i++){
        try{
            if(ecommerces[i].getClicks_in_site()!=0)
            {
                averageNumberOfClicks=averageNumberOfClicks+ecommerces[i].getClicks_in_site();
            }
            else{
                count=count+1;
            }
        }
        catch(NullPointerException n){
            continue;
        }
    }
    int clicks=ecommerces.length-count;
    System.out.println("the avg number of clicks is"+(averageNumberOfClicks-clicks)/ecommerces.length);
}
 }