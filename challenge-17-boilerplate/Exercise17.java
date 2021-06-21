import java.util.Scanner;
public class Exercise17 {
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
            int[] total = totalMarks(marks1, marks2, marks3, marks4, marks5,num);
            topScorer(total,arr,roll,num);
            int[] avg=avgMark(total,arr,num);
            for(int i=0;i<num;i++)
            {
               System.out.println("The avg of:"+arr[i]+" is"+avg[i]);
            }
            clearStudent(marks1,marks2,marks3,marks4,marks5,arr,roll,num);
            repeatExam(marks1,marks2,marks3 ,marks4,marks5,arr,roll,num);
            char[] studentAvg=grade(avg,arr,total,num);
            scoreCard( arr,roll, marks1, marks2, marks3,marks4, marks5,total,studentAvg,num);
            displayingHistogram(avg,num);
        }

 
        public static int[] totalMarks(int[] marks1, int[] marks2, int[] marks3, int[] marks4, int[] marks5 ,int num) {
            int[] total=new int[num];
            for(int i=0;i<num;i++)
            {
                 total[i] = marks1[i] + marks2[i] + marks3[i] + marks4[i] + marks5[i];
            }
            return total;
        }
        public static void topScorer(int[] total, String[] arr, int[] roll,int num) {
            int max=total[0];
              for(int i=0;i<total.length;i++){
                  if(total[i]>max)
                  max=total[i];
              }
              for(int i=0;i<num;i++)
              {
                 if(max==total[0])
                    {
                     System.out.println("The highest scored student is"+arr[i]+" "+roll[i]+" "+max);
                    }
            }
        }
              
        public static int[] avgMark(int[] total, String[] arr,int num) {
            int[] avg = new int[num];
            for(int i=0;i<num;i++)
            {
             avg[i]=total[i]/5;
            }
                return avg;
                
        }
        public static void clearStudent(int[] marks1 ,int[] marks2,int[] marks3,int[] marks4,int[] marks5,String[] arr,int[] roll,int num) {
            for(int i=0;i<num;i++)
            {
            if(marks1[i]>=35 && marks2[i]>=35 && marks3[i]>=35 && marks4[i]>=35 && marks5[i]>=35)
                {
                
                    System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Pass");
                }
            }
               
        }
        public static void repeatExam(int[] marks1,int[] marks2,int[] marks3,int[] marks4,int[] marks5,String[] arr,int[] roll,int num) {
            for(int i=0;i<num;i++)
            {
            if(marks1[i]<=35 || marks2[i]<=35 || marks3[i]<=35 || marks4[i]<=35 || marks5[i]<=35)
                {
                
                    System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Has to write the exam again");
                }
            }
                
        }
        public static char[] grade(int[] avg, String [] arr,int[] total,int num) {

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
        for(int i=0;i<avg.length;i++){
            System.out.println(arr[i]+" "+studentAvg[i]+" "+total[i]+" "+avg[i]);
        }
        return studentAvg;
    }
    public static void scoreCard(String[] arr,int[] roll, int[] marks1,int[] marks2, int[] marks3,int[] marks4,int[] marks5,int[] total,char[] studentAvg,int num) {
        for(int i=0;i<num;i++){
            System.out.println("The report of Student:\n"+"Name: "+arr[i]+"\n"+ "Roll No."+roll[i]+"\n"+"Subject names:"+"Maths="+marks1[i]+" Science:"+marks2[i]+" "+"English"+marks3[i]+" "+"Language:"+marks4[i]+" "+"Social:"+marks5[i]+"\n"+"Totalmarks:"+total[i]+" \n"+"Grade:"+studentAvg[i]);
           }
        }
    
       public static void displayingHistogram(int [] avg,int  num)
            {
                num=num+1;
                String a[][]=new String [11][num];
                //**printing the 100 to 10 values */
                a[0][0]="100 ";a[1][0]="90 ";a[2][0]="80 ";a[3][0]="70 ";a[4][0]="60 ";a[5][0]="50 ";a[6][0]="40 ";a[7][0]="30 ";a[8][0]="20 ";a[9][0]="10 ";a[10][0]="   ";
                //**printing noOfStudents */
                for(int i=1;i<num;i++)
                {
                    a[10][i]=" "+String.valueOf(i);
                } 
                int m=100;
                //**assigning the space and * to matrix array */
                for(int k=0 ;k<11 ;k++){
                    if(m==0)
                    {
                        break;
                    }
                    for(int j=1;j<num;j++)
                    {
                        if(avg[j-1]>=m)
                        {
                            a[k][j]=" *";
            
                        }
                        if(avg[j-1]<m)
                        {
                            a[k][j]="  ";
                        }
                    }
                    m=m-10;
                }
                //**printing the values in array */
                for(int k=0 ;k<11 ;k++){
                    for(int j=0;j<num;j++)
                    {
                        System.out.print(a[k][j]);
                    }
                    System.out.println();
                }
            
            }

    
}
