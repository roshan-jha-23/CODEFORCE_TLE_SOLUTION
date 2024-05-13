import java.util.*;

public class UnitedWeStand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of array a
            int[] arr = new int[n]; // Array a
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Input array a
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int a : arr) {
                mp.put(a, mp.getOrDefault(a, 0) + 1);
            }

            if (mp.size() == 1) {
                // All elements are same
                System.out.println("-1");
            } else {
                Iterator<Map.Entry<Integer, Integer>> iterator = mp.entrySet().iterator();
                Map.Entry<Integer, Integer> entry = iterator.next();
                int ele = entry.getKey(); // Key: element
                int fre = entry.getValue(); // Value: frequency

                // Find the first element not equal to 1
                int index = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] != 1) {
                        index = i;
                        break;
                    }
                }

                // Output
                System.out.println(fre + " " + (n - fre));
                for (int i = 0; i < fre; i++) {
                    System.out.print(ele + " ");
                }
                System.out.println();

                // Print c
                for (int i = 0; i < n; i++) {
                    if (i != index) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
