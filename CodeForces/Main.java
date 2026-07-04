import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long L = sc.nextLong();
            long R = sc.nextLong();

            long ans = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();

                if (a < L) {
                    ans += (L - a);     
                } else if (a > R) {
                    ans += (a - R);      
                }
            }

            System.out.println(ans);
        }
    }
}