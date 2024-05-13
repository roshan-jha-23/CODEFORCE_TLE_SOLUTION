import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(x);
            int count = 0;
            while (count <= 5 && !sb.toString().contains(s)) {
                sb.append(x);
                count++;
                x += x;
            }
            System.out.println(count <= 5 ? count : -1);
        }
    }
}
