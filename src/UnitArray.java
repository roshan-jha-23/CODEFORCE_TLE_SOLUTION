import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int cntp = 0;
            int cntm = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == -1) cntm++;
                else cntp++;
            }

           if(cntp>=cntm){
               if((cntm&1)==1) System.out.println(1);
               else System.out.println(0);
               return;
           }else{
               int op=cntm-n/2;
               if(((n/2)&1)==1)op++;
               System.out.println(op);
           }
        }

        sc.close();
    }
}
