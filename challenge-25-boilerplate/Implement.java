
public class Implement {
    public static int[] totalMarks(Student[] students,int num) {
        int[] total=new int[num];
        for( int i=0;i<num;i++)
        {
            total[i] = students[i].getMarks1() +students[i].getMarks2() + students[i].getMarks3() + students[i].getMarks4() +students[i].getMarks5();
        }
    
        return total;
    }

     public void topScorer(Student[] students,int[] total,int num) {
        int max=total[0];
          for(int i=0;i<total.length;i++){
              if(total[i]>max)
              max=total[i];
          }
          for(int i=0;i<num;i++)
          {
            if(max==total[i])
          {
               System.out.println("The highest scored student is:"+students[i].getName()+" "+students[i].getRollNo()+" "+max);
          }
        }
          
    }
      public static  int[] avgMark(int[] total,int num) {
          int[] avg=new int[num];
          for(int i=0;i<num;i++)
          {
             avg[i]=total[i]/5;
          }
           
            return avg;
            
    }
      public void clearStudent(Student[] students,int num) {
          for(int i=0;i<num;i++)
          {
           if(students[i].getMarks1() >= 35 && students[i].getMarks2() >= 35 && students[i].getMarks3() >= 35 && students[i].getMarks4() >= 35 && students[i].getMarks5() >= 35)
            {
            
            System.out.println("The student"+" "+students[i].getName()+" "+students[i].getRollNo()+" Pass");
            }
        
          else
           {
            System.out.println("The student"+" "+students[i].getName()+" "+students[i].getRollNo()+" Has to write exam");
           }
        }
    }

           
    public static char[] grade( Student[] students,int[] avg, int[] total,int num) {

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
        System.out.println(students[i].getName()+" "+studentAvg[i]+" "+total[i]+" "+avg[i]);
    }
        return studentAvg;
    }
    public  void scoreCard(Student[] students,int[] total,char[] studentAvg,int num) {
       for(int i=0;i<num;i++){
        System.out.println("The report of Student:\n"+"Name: "+students[i].getName()+"\n"+ "Roll No."+students[i].getRollNo()+"\n"+"Subject names:"+"Maths="+students[i].getMarks1()+" Science:"+students[i].getMarks1()+" "+"English"+students[i].getMarks2()+" "+"Language:"+students[i].getMarks3()+" "+"Social:"+students[i].getMarks4()+"\n"+"Totalmarks:"+total[i]+" \n"+"Grade:"+studentAvg[i]);
       }
      
    }

   public  void displayingHistogram(int[] avg, int num)
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


