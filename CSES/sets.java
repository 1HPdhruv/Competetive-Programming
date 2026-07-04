import java.util.*;

public class sets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = (n * (n + 1)) / 2;
        if (sum % 2 != 0)
            System.out.println("NO");
        else {
            long s = sum / 2;
            ArrayList<Long> A = new ArrayList<>();
            ArrayList<Long> B = new ArrayList<>();
            for (long i = n; i > 0; i--) {
                if (s >= i) {
                    A.add(i);
                    s -= i;
                } else {
                    B.add(i);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("YES\n");
            sb.append(A.size()).append("\n");
            for (long x : A) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            sb.append(B.size()).append("\n");
            for (long x : B) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            System.out.print(sb);
        }
    }
}
