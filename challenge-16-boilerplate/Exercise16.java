import java.util.Arrays;
import java.util.Scanner;
public class Exercise16 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the number of words");
        int num=sc.nextInt();
        String[] name=new String[num];
        System.out.println("Enter the words");
        for(i=0;i<num;i++){
            name[i]=sc.next();
        }
        String smallest=name[0];
        for(i=1;i<num;i++){
          if(name[i].length()<smallest.length()){
           smallest=name[i];
          }
        }
        System.out.println("The smallest word is"+smallest);
        System.out.println("Enter a word");
        String str=sc.next();
        boolean found=false;
        for(i=0;i<num;i++){
            if(str.equals(name[i])){
               found=true;
                break;
            }
        }
		if(found)
        System.out.println("The element is found");
        else
        System.out.println("The element is not found");
        // sorting the string in array
            Arrays.sort(name);
            for(i=0;i<num;i++){
                System.out.println(name[i]);
            }
        // check whether a string is a palindrome
        String temp="";
        int count=0;
        for(i=0;i<num;i++){
            for(int k=name[i].length()-1;k>=0;k--){
                temp=temp+name[i].charAt(k);
            }
            if(name[i].equalsIgnoreCase(temp))
           {
            System.out.println(name[i]);
            count=count+1;
           }
        }
            System.out.println(count);
        
    }
    
}
