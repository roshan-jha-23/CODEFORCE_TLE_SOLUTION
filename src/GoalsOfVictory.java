import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n-1];
            int sum=0;
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println((-1)*(sum));//-30 12 -57 7 0 -81 -68 41 -89 0
        }
    }
}
