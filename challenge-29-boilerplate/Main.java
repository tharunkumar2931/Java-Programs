import java .util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the TransmissionType:");
        String type=sc.next();
        System.out.println("Enter Model Number");
        String model=sc.next();
        if(type.equalsIgnoreCase("manual"))
        {
            Manual m=new Manual(model);
            m.showSpec();
        }
        if(type.equalsIgnoreCase("amt"))
        {
            AutomaticManualTransmission am=new AutomaticManualTransmission(model);
            am.showSpec();
        }
        if(type.equalsIgnoreCase("cvt"))
        {
            AutomaticCVT ac=new AutomaticCVT(model);
            ac.showSpec();
        }
        if(type.equalsIgnoreCase("dct"))
        {
            AutomaticDCT ad=new AutomaticDCT(model);
            ad.showSpec();
        }
        sc.close();
    }


        
}