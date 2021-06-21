public class Exercise21 {
    public static void main(String[] args){
        int[] arr={2,5,4,6,7};
        sort(arr); 
    }
    public static void sort(int[] arr) {

        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int num: arr) {
            System.out.print(num+ " ");
        }
    }
}
