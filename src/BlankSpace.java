import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxLength = 0;
            int currentLength = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    currentLength++;
                    maxLength = Math.max(currentLength, maxLength);
                } else {
                    currentLength = 0;
                }
            }
            System.out.println(maxLength);
        }
        sc.close();
    }
}
