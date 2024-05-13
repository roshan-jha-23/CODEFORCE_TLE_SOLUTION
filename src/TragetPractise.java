import java.util.Scanner;

public class TragetPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            char[][] vals = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String line = sc.next();
                for (int j = 0; j < 10; j++) {
                    vals[i][j] = line.charAt(j);
                }
            }

            int totalPoints = calculatePoints(vals);
            System.out.println(totalPoints);
        }
    }

    // Function to calculate the total points of arrows
    private static int calculatePoints(char[][] grid) {
        int[] ringPoints = {1, 2, 3, 4, 5}; // Points corresponding to each ring
        int totalPoints = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (grid[i][j] == 'X') {
                    // Calculate points based on the ring
                    int ringIndex = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                    totalPoints += ringPoints[ringIndex];
                }
            }
        }
        return totalPoints;
    }
}
