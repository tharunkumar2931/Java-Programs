import java.util.Scanner;
    public class Exercise14{
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
                int[] avg = new int[num];
                 for(int i=0;i<num;i++)
                 {
                   avg[i]=total[i]/5;
                 }
                for(int i=0;i<num;i++)
                {
                System.out.println("The avg of:"+arr[i]+" is"+avg[i]);
                }
                displayingHistogram(avg,num);
                sc.close();
            }
            //**method for displaying histogram*/
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
