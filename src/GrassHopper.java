import java.util.Scanner;

public class GrassHopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = sc.nextInt();

            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                System.out.println(x - 1 + " " + 1);
            }
        }
        sc.close();
    }
}
