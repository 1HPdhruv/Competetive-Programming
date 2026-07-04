import java.io.BufferedReader;
import java.io.InputStreamReader;

public class permutation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (n == 2 || n == 3)
            sb.append("NO SOLUTION");
        else if (n == 4)
            sb.append("2 4 1 3");
        else {
            for (long i = n; i > 0; i--) {
                if (i % 2 == 0)
                    sb.append(i + " ");
            }
            for (long i = n; i > 0; i--) {
                if (i % 2 != 0)
                    sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());
    }
}