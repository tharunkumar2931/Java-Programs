public class studentImplementation {
         public int[] totalMarks(int[] marks1, int[] marks2, int[] marks3, int[] marks4, int[] marks5,int num) {
            int[] total=new int[num];
            for(int i=0;i<num;i++)
            {
                 total[i] = marks1[i] + marks2[i] + marks3[i] + marks4[i] + marks5[i];
            }
             return total;
         }
         public void topScorer(int[] total, String[] arr, int[] roll,int num) {
             int max=total[0];
               for(int i=0;i<total.length;i++){
                   if(total[i]>max)
                   max=total[i];
               }
               for(int i=0;i<num;i++)
               {
                  if(max==total[i])
                   {
                      System.out.println("The highest scored student is:"+arr[i]+" "+"Rollno"+roll[i]+"is"+max);
                    }
               }
              
         }
         public int[] avgMark(int[] total,String[] arr,int num) {
            int[] avg = new int[num];
            for(int i=0;i<num;i++)
            {
             avg[i]=total[i]/5;
            }
                 return avg;
                 
         }
         public void clearStudent(int[] marks1 ,int[] marks2,int[] marks3,int[] marks4,int[] marks5,String[] arr,int[] roll,int num) {
             for(int i=0;i<num;i++)
                {
                    if(marks1[i]>=35 && marks2[i]>=35 && marks3[i]>=35 && marks4[i]>=35 && marks5[i]>=35)
                    {
                     System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Pass");
                    }
                }
                 
            }
         public void repeatExam(int[] marks1,int[] marks2,int[] marks3,int[] marks4,int[] marks5,String[] arr,int[] roll,int num) {
             for(int i=0;i<num;i++)
                {
                    if(marks1[i]<=35 || marks2[i]<=35 || marks3[i]<=35 || marks4[i]<=35 || marks5[i]<=35)
                    {
                     System.out.println("The student"+" "+arr[i]+" "+roll[i]+" Has to write the exam again");
                     }
                }
            }
                 
         public char[] grade(int[] avg, String [] arr,int[] total,int num) {
 
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
         public void scoreCard(String[] arr,int[] roll, int[] marks1,int[] marks2, int[] marks3,int[] marks4,int[] marks5,int[] total,char[] studentAvg,int num) {
            for(int i=0;i<num;i++){
             System.out.println("The report of Student:\n"+"Name: "+arr[i]+"\n"+ "Roll No."+roll[i]+"\n"+"Subject names:"+"Maths="+marks1[i]+" Science:"+marks2[i]+" "+"English"+marks3[i]+" "+"Language:"+marks4[i]+" "+"Social:"+marks5[i]+"\n"+"Totalmarks:"+total[i]+" \n"+"Grade:"+studentAvg[i]);
            }
           
         }
     
        public void displayingHistogram(int[] avg, int num)
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
