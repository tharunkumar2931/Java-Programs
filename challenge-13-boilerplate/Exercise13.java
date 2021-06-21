import java.util.Scanner;
import java.util.Arrays;
public class Exercise13{
    public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of students");
         int num=sc.nextInt();
         String[] arr=new String[num];
         System.out.println("Enter the  students name :");
          for(int i=0;i<num;i++){
            arr[i]=sc.next();
          } 
            int[] roll=new int[num];
                System.out.println("Enter the roll number:");
                for(int i=0;i<num;i++){
                    roll[i]=sc.nextInt();
              } 
            int[] marks1=new int[num];
            System.out.println("Enter the Maths marks");
            for(int i=0;i<num;i++){
                marks1[i]=sc.nextInt();
            }
             int[] marks2=new int[num];
            System.out.println("Enter the Science marks");
            for(int i=0;i<num;i++){
                marks2[i]=sc.nextInt();
            }
                int[] marks3=new int[num];
            System.out.println("Enter the English marks");
            for(int i=0;i<num;i++){
                marks3[i]=sc.nextInt();
            }
                int[] marks4=new int[num];
            System.out.println("Enter the Language marks");
            for(int i=0;i<num;i++){
                marks4[i]=sc.nextInt();
            }
                int[] marks5=new int[num];
            System.out.println("Enter the Social studies marks");
            for(int i=0;i<num;i++){
                marks5[i]=sc.nextInt();
            }
            int[] total=new int[num];
            for(int i=0;i<num;i++)
            {
                 total[i] = marks1[i] + marks2[i] + marks3[i] + marks4[i] + marks5[i];
            }
            int max=total[0];
              for(int i=0;i<total.length;i++){
                  if(total[i]>max)
                  max=total[i];
              }
              int[] avg = new int[num];
              for(int i=0;i<num;i++)
              {
               avg[i]=total[i]/5;
              }
              char[] studentAvg=new char[num];
            for(int i=0;i<avg.length;i++){
              
              if(avg[i]>=90){
                studentAvg[i]='A';
            }
            else if(avg[i]>=80 && avg[i]<90){
                studentAvg[i]='B';
            }
             else if(avg[i]>=70 && avg[i]<80 ){
                studentAvg[i]='C';
            }
             else if(avg[i]>=60 && avg[i]<70){
                studentAvg[i]='D';  
            }
             else if(avg[i]>=50 && avg[i]<60){
                studentAvg[i]='E';
            }
            else
            {
                studentAvg[i]='F'; 
            }
        }
        Arrays.sort(studentAvg);
         for(int i=0;i<studentAvg.length;i++){
          System.out.println("The grade of :"+ arr[i]+" is"+studentAvg[i]);
        }

       
       for(int i=0;i<num;i++){
        System.out.println("The report of Student:\n"+"Name: "+arr[i]+"\n"+ "Roll No."+roll[i]+"\n"+"Subject names:"+"Maths="+marks1[i]+" Science:"+marks2[i]+" "+"English"+marks3[i]+" "+"Language:"+marks4[i]+" "+"Social:"+marks5[i]+"\n"+"Totalmarks:"+total[i]+" \n"+"Grade:"+studentAvg[i]);
       }
    }
          
}
