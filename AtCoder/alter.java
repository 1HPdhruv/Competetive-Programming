import java.util.*;

public class alter {
    static long solve(long A, long B, long X, long Y) {
        long h = Math.abs(X);
        long v = Math.abs(Y);

        long ans = calc(A, B, h, v);

        long d = Math.abs(h - v);
        long r = d % 2;

        if (A < B && B > 3 * A) {
            long alt;
            if (h < v) {
                alt = 2 * A * (v - r) + r * B;
            } else {
                alt = 2 * A * (h - r) + r * A;
            }
            ans = Math.min(ans, alt);
        }

        if (A > B && A > 3 * B) {
            long alt;
            if (h < v) {
                alt = 2 * B * (v - r) + r * B;
            } else {
                alt = 2 * B * (h - r) + r * A;
            }
            ans = Math.min(ans, alt);
        }

        return ans;
    }

    static long calc(long A, long B, long H, long V) {
        if (A < B) {
            if (H >= V) {
                return 2 * A * V
                        + ((H - V) / 2) * (A + B)
                        + ((H - V) % 2) * A;
            } else {
                return 2 * A * H
                        + ((V - H) / 2) * (A + B)
                        + ((V - H) % 2) * B;
            }
        } else {
            if (H >= V) {
                return 2 * B * V
                        + ((H - V) / 2) * (A + B)
                        + ((H - V) % 2) * A;
            } else {
                return 2 * B * H
                        + ((V - H) / 2) * (A + B)
                        + ((V - H) % 2) * B;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();

            sb.append(solve(A, B, X, Y)).append('\n');
        }

        System.out.print(sb);
    }
}