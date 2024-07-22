import java.util.Scanner;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }
            int tot = min + max;

            for (int i = 0; i < n; i++) {
                System.out.print((tot - arr[i]) + " ");
            }

        }
        sc.close();
    }
}
