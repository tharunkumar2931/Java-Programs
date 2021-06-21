import java.util.Scanner;
public class Main {

    public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              
              System.out.println("Enter the number of students");
              int num=sc.nextInt();
              Student[] students=new Student[num];
                 for(int i=0;i<num;i++)
                 {
                     Student s=new Student();
                     System.out.println("Enter the  students name :");
                     String name=sc.next();
                     s.setName(name);
                     System.out.println("Enter the roll number:");
                     int roll=sc.nextInt();
                     s.setRollNo(roll);
                     System.out.println("Enter the Maths marks");
                     int maths=sc.nextInt();
                     s.setMarks1(maths);
                     System.out.println("Enter the science marks");
                     int science =sc.nextInt();
                     s.setMarks2(science);
                     System.out.println("Enter the English marks");
                     int english=sc.nextInt();
                     s.setMarks3(english);
                     System.out.println("Enter the language marks");
                     int language=sc.nextInt();
                     s.setMarks4(language);
                     System.out.println("Enter the Social marks");
                     int social=sc.nextInt();
                     s.setMarks5(social);
                     students[i]=s;
                 }
                Implement si=new Implement();
                int[] total = Implement.totalMarks(students,num);
                si.topScorer(students, total,num);
                int[] avg=Implement.avgMark(total,num);
                si.clearStudent(students,num);
                char[] studentAvg=Implement.grade(students, avg, total, num);
                si.scoreCard( students,total,studentAvg,num);
                si.displayingHistogram(avg,num);
    }
}
            
    

