import java.util.Scanner;
public class Exercise12{
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
            
             for(int i=0;i<num;i++)
              {
              System.out.println("The total marks scored by :"+arr[i]+" "+ "Rollno:"+roll[i]+"is"+" "+total[i]);
              }
              
              int max=total[0];
              for(int i=0;i<total.length;i++){
                  if(total[i]>max)
                  max=total[i];
              }
              for(int i=0;i<num;i++)
              {
                  if(max==total[i])
                 {
                     System.out.println("The highest scored student is:"+arr[i]+" "+ "Rollno:"+roll[i]+" "+max);
                 }
             }
              int[] avg = new int[num];
              for(int i=0;i<num;i++)
              {
               avg[i]=total[i]/5;
              }
              for(int i=0;i<num;i++)
              {
              System.out.println("The average marks obtained by each student is:"+" "+arr[i]+" "+"Rollno:"+roll[i]+"="+avg[i]);
              }
        }

}   
