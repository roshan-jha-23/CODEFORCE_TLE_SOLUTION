import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int min=(int)(1e9);
       for(int i=0;i<n;i++){
           int x=sc.nextInt();
           min=Math.min(min,Math.abs(x));
       }
        System.out.println(min);
    }
}
