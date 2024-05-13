import java.util.Scanner;

public class Halloumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            t--;

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n <= 1) {
                System.out.println("Yes");
            } else {
                if (k == 1) {
                    if (isArraySorted(arr)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

