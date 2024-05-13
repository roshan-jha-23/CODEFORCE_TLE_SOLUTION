import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //subsegment can be size>=1 hence even if its single ocuurance means it presnt most no of times
        while(t-->0){
            //inputs regarding Question
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean flag=false;
            for(int x:arr){
                if(x==k){
                    flag=true;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
