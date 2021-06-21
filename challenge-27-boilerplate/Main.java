import java.util.Scanner;

import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int min=100;
        int max=500;
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
          if(age>=60&&age<=100)
          {
            customer.setCitizen(" Senior citizen"); 
          }
          else if(age>18&&age<60)
          {
             customer.setCitizen("Public citizen");
          }
          else
          {
             customer.setCitizen("Minor");
          }
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
             int amount=1000;
             customer.setAmount(amount);
             customer.setCustomerId(i+1);
             obj[i]=customer;
           }
           int[] b=new int[num];
           for(int i=0;i<num;i++)
           {
             b[i]=(int)(Math.random()*(max-min+1)+min);
           }

              
            // Function si=new Function();   
             System.out.println("Enter which customer detials required based on last name");
             String details=sc.next();
             for(int i=0;i<num;i++)
            {
              if(details.equals(obj[i].getLastname()))
               {
                 System.out.println("Customer Id:"+obj[i].getCustomerId());
                 System.out.println("Name:"+obj[i].getFirstname());
                 System.out.println("Age:"+obj[i].getAge());
                 System.out.println("Citizen:"+obj[i].getCitizen());
                 System.out.println("Account number:"+"SBI123456"+b[i]);
                 System.out.println("Mobile number:"+obj[i].getMobilenumber());
                System.out.println("Village:"+obj[i].getVillage());
                bankOperation(i, obj);
                    }
                  }
                }
                public static void bankOperation(int i, Customer[] obj) {
                         Scanner sc=new Scanner(System.in);
                        Function si=new Function();   
                       System.out.println("Enter which detail u are looking for 1.Withdraw 2.Balance.3.Deposit 4.Transaction 5.Exit");
                         int no=sc.nextInt();
                         switch(no){
                           case 1 :
                          {
                            si.withdrawAmount(i, obj);
                            break;
                          }
                         case 2 :
                          {
                            si.balanceAmount(i,obj);
                            break;
                          }
                          case 3:
                          {
                           si.depositAmount(i,obj);
                           break;
                          }
                         case 4:
                          {
                            si.transactionAmount(i,obj);
                            break;
                          }
                          case 5:
                          {
                            break;
                          }
                       }
                      }
                      
                      
  
    
}


	