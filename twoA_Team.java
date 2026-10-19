import java.util.Scanner;

public class twoA_Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        int countT = 0, countR;
        for (int i = 0; i < n; i++) {
            countR = 0;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1) countR++;
            }
            if (countR >= 2) countT++;
        }
        System.out.println(countT);
    }
}
