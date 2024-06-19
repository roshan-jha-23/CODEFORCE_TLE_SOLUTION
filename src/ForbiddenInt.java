import java.util.ArrayList;
import java.util.Scanner;

public class ForbiddenInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // the target
            int k = sc.nextInt(); // the range from 0 to k
            int x = sc.nextInt(); // the forbidden one
            int[] arr = new int[k + 1];
            int index = 0;
            for (int i = 0; i <= k; i++) {
                if (i == x) continue;
                arr[index++] = i;
            }
            ArrayList<Integer> li = new ArrayList<>();
            if (!knapsack(index , arr, x, n, li)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                System.out.println(li.size());
                for (int z : li) {
                    System.out.println(z);
                }
            }
        }
        sc.close();
    }

    static boolean knapsack(int n, int[] arr, int x, int tar, ArrayList<Integer> li) {
        if (tar == 0) {
            return true;
        }
        if (n < 0 || tar < 0) {
            return false;
        }

        boolean notTake = knapsack(n - 1, arr, x, tar, li);

        boolean take = false;
        if ( arr[n]<=tar&&arr[n] != x) {
            li.add(arr[n]);
            take = knapsack(n , arr, x, tar - arr[n], li);
            if (!take) {
                li.remove(li.size() - 1);
            }
        }

        return take || notTake;
    }
}
