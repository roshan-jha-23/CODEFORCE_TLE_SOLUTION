import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            int count = 1;
            StringBuilder sequence = new StringBuilder();
            sequence.append(prev).append(" ");
            for (int i = 1; i < n; i++) {
                int current = sc.nextInt();
                if (current < prev) {
                    sequence.append(current).append(" ").append(current).append(" ");
                    count += 2;
                } else {
                    sequence.append(current).append(" ");
                    count++;
                }
                prev = current;
            }
            System.out.println(count);
            System.out.println(sequence.toString().trim());
        }
    }
}
