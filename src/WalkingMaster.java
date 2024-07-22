import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(minMoves(a, b, c, d));
        }
        sc.close();
    }

    private static int minMoves(int a, int b, int c, int d) {
        // Check feasibility
        if ((c - a) % 2 != (d - b) % 2) {
            return -1;
        }

        if (a == c && b == d) {
            return 0;
        }

        if (c >= a && d >= b) {
            return Math.max(c - a, d - b);
        } else if (c < a) {
            int moveLeft = a - c;
            int targetB = b - moveLeft;
            if (targetB <= d) {
                return moveLeft + (d - targetB);
            }
        }

        return -1;
    }
}
