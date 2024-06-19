
import java.util.Scanner;
public class Desorting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(!isSorted(arr)){
                System.out.println(0);
            }else {
                int mini = (int) (1e9 + 10);
                for (int i = 0; i < n - 1; i++) {
                    mini = Math.min(mini, arr[i + 1] - arr[i]);
                }
                System.out.println(mini / 2 + 1);
            }
        }
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
