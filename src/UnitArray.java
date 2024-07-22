import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cntno = 0;
            int cntpo = 0;

            for (int i = 0; i < n; i++) {
                int elm = sc.nextInt();
                if (elm == -1) cntno++;
                else cntpo++;
            }

             if (cntpo >= cntno) {
                if ((cntno & 1) == 0) System.out.println(0);
                else System.out.println(1);
            } else {
                int op = 0;
                op+=(cntno-cntpo+1)/2;
                cntno-=op;
                if((cntno&1)==1){
                    op++;
                }
                System.out.println(op);
            }
        }
        sc.close();
    }
}
