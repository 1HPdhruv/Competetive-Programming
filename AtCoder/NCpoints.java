import java.util.*;

public class NCpoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] yAtX = new int[N + 1];

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            yAtX[X] = Y;
        }

        int minY = Integer.MAX_VALUE;
        int ans = 0;

        for (int x = 1; x <= N; x++) {
            if (yAtX[x] < minY) {
                ans++;
                minY = yAtX[x];
            }
        }

        System.out.println(ans);
    }
}