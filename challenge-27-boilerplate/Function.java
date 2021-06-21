import java.util.Scanner;
public class Function {
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
         public  void withdrawAmount(int i, Customer[] obj) {
         System.out.println("Enter the amount to be withdraw");
         int withdraw=sc.nextInt();
         int result=obj[0].getAmount()-withdraw;
         System.out.println("Balance amount:"+result);
         obj[i].setAmount(result);
         Main.bankOperation(i, obj);
        }
	public void balanceAmount(int i, Customer[] obj ) {
         System.out.println("Balance Amount:"+obj[i].getAmount());
         Main.bankOperation(i, obj);
	}
	public void depositAmount(int i, Customer[] obj) {
         System.out.println("Enter the amount to deposit");
         int deposit=sc.nextInt(); 
         int result=obj[i].getAmount()+deposit;
         obj[i].setAmount(result);
         Main.bankOperation(i, obj);
	}
	public void transactionAmount(int i, Customer[] obj) {
        System.out.println("Enter the AccNo");
        String accNo=sc.next();
        if(accNo.length()==(13))
        {
            System.out.println("Enter the amount");
            int amo=sc.nextInt();
            int result=obj[i].getAmount()-amo;
            obj[i].setAmount(result);

        }
        else
        {
            System.out.println("Enter a correct Accno");
        }
        Main.bankOperation(i, obj);
        }
        
}

    

