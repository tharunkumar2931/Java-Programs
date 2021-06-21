import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Engine type:");
        String engineType=sc.next();
        System.out.println("Engine power source:");
        String powerSource=sc.next();
        System.out.println("Engine Model Number:");
        int modelNumber=sc.nextInt();
        Engines en=new Engines();
        en.showSpecifications(engineType,powerSource,modelNumber);
        sc.close();
    }
}



