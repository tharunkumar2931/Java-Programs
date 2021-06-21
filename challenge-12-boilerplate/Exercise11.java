import java.util.Scanner;
    public class Exercise11{
        public static void main(String [] args){
             Scanner sc=new Scanner(System.in);
             int i;
             System.out.println("Enter the number of students");
               int num=sc.nextInt();
             String[] arr=new String[num];
             System.out.println("Enter the  students name :");
              for(i=0;i<num;i++){
                  arr[i]=sc.next();
                }
                int[] roll=new int[num];
                System.out.println("Enter the roll number:");
                for(i=0;i<num;i++){
                    roll[i]=sc.nextInt();
                } 
                int[] marks1=new int[num];
                System.out.println("Enter the Maths marks");
                for(i=0;i<num;i++){
                    marks1[i]=sc.nextInt();
                }
                 int[] marks2=new int[num];
                System.out.println("Enter the Science marks");
                for(i=0;i<num;i++){
                    marks2[i]=sc.nextInt();
                }
                    int[] marks3=new int[num];
                System.out.println("Enter the English marks");
                for(i=0;i<num;i++){
                    marks3[i]=sc.nextInt();
                }
                    int[] marks4=new int[num];
                System.out.println("Enter the Language marks");
                for(i=0;i<num;i++){
                    marks4[i]=sc.nextInt();
                }
                    int[] marks5=new int[num];
                System.out.println("Enter the Social studies marks");
                for(i=0;i<num;i++){
                    marks5[i]=sc.nextInt();
                }  
                for (i=0;i<num;i++)
                {
                    if(marks1[i]>=35 && marks2[i]>=35 && marks3[i]>=35 && marks4[i]>=35 && marks5[i]>=35)
                   {
                
                    System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Pass");
                    }
                     else
                        {
                          System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Has to write exam again");
                        }
                    }
                }
        
    }
    


               
        
                

