import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of customer");
        int num=sc.nextInt();
        Customer[] obj=new Customer[num];
        for( int i=0;i<num;i++)
        {
          Customer customer=new Customer();
          System.out.println("Enter the First name");
          String firstname=sc.next();
          customer.setFirstname(firstname);
          System.out.println("Enter the last name");
          String lastname=sc.next();
          customer.setLastname(lastname);
          System.out.println("Enter the age");
          int age=sc.nextInt();
          customer.setAge(age);
          System.out.println("Enter the  phone number");
          String mobilenumber=sc.next();
           if(mobilenumber.length()==10)
            {
               customer.setMobilenumber(mobilenumber);
            }
           else
            {
              System.out.println(" enter a valid number");
              System.out.println("Enter the  phone number");
              mobilenumber=sc.next(); 
              customer.setMobilenumber(mobilenumber);   
            }
             System.out.println("Enter the village name");
             String village =sc.next();
             customer.setVillage(village);
             customer.setCustomerId(i+1);
              obj[i]=customer;
            }
            
             System.out.println("Enter which customer detials required by printing last name");
             String details=sc.next();
             for(int i=0;i<num;i++)
            {
              if(details.equals(obj[i].getLastname()))
                    {
                      System.out.println("Customer Id:"+obj[i].getCustomerId());
                      System.out.println("Name:"+obj[i].getFirstname());
                      System.out.println("Age:"+obj[i].getAge());
                      System.out.println("Mobile number:"+obj[i].getMobilenumber());
                      System.out.println("Village:"+obj[i].getVillage());
                   }
           }
          System.out.println("Enter the village name to list the  customer ");
          String vlg=sc.next();
        
          for(int i=0;i<num;i++)
           {
               if(vlg.equals(obj[i].getVillage()))
                {
                  System.out.println("Cutomer Id:"+obj[i].getCustomerId()+" "+"Name:"+obj[i].getFirstname()+" "+"Age:"+obj[i].getAge()+" "+" Mobile number:"+obj[i].getMobilenumber());
               
                }   
           }
    }


    


    


        
        
        
    
}
