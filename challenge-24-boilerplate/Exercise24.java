import java.util.Scanner;
public class Exercise24{
    public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              studentImplementation si=new studentImplementation();
              System.out.println("Enter the number of students");
              int num=sc.nextInt();
              String[] arr=new String[num];
              System.out.println("Enter the  students name :");
                 for(int i=0;i<num;i++)
                 {
                    arr[i]=sc.next();
                 }
                 int[] roll=new int[num];
                 System.out.println("Enter the roll number:");
                 for(int i=0;i<num;i++)
                 {
                    roll[i]=sc.nextInt();
                 } 
                 int[] marks1=new int[num];
                 System.out.println("Enter the Maths marks");
                 for(int i=0;i<num;i++)
                 {
                    marks1[i]=sc.nextInt();
                 }
                  int[] marks2=new int[num];
                 System.out.println("Enter the Science marks");
                 for(int i=0;i<num;i++)
                 {
                    marks2[i]=sc.nextInt();
                 }
                    int[] marks3=new int[num];
                 System.out.println("Enter the English marks");
                 for(int i=0;i<num;i++)
                 {
                    marks3[i]=sc.nextInt();
                 }
                    int[] marks4=new int[num];
                 System.out.println("Enter the Language marks");
                 for(int i=0;i<num;i++)
                 {
                    marks4[i]=sc.nextInt();
                 }
                    int[] marks5=new int[num];
                 System.out.println("Enter the Social studies marks");
                 for(int i=0;i<num;i++)
                  {
                    marks5[i]=sc.nextInt();
                 }
                int[] total = si.totalMarks(marks1, marks2, marks3, marks4, marks5,num);
                si.topScorer(total,arr,roll,num);
                int[] avg=si.avgMark(total,arr,num);
                si.clearStudent(marks1,marks2,marks3,marks4,marks5,arr,roll,num);
                si.repeatExam(marks1,marks2,marks3 ,marks4,marks5,arr,roll,num);
                char[] studentAvg=si.grade(avg,arr,total,num);
                si.scoreCard( arr,roll, marks1, marks2, marks3,marks4, marks5,total,studentAvg,num);
                si.displayingHistogram(avg,num);
    }
}
            
    
            

    
