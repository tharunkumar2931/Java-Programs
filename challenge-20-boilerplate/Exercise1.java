public class Exercise1{
    public static void main(String [] args){
        fibonacci(10);
    }
        public static int fibonacci(int n) {
            if(n<1) {
                return 0;
            }
            int a = 0;
            int b = 1;
            int sum=0;
            for (int i=0;i<n;i++) {
                sum=a+b;
                a=b;
                b=sum;
                System.out.println(" "+sum);
            }
    
            return sum;
        }
    
}
    



