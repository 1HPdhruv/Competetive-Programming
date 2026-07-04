import java.io.*;
import java.util.*;

public class diff_dist {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] ans = new int[4 * n];
            for (int i = 0; i < n; i++)
                ans[i] = i + 1;
            for (int i = 0; i < n; i++)
                ans[n + i] = i + 1;
            for (int i = 0; i < n - 1; i++)
                ans[2 * n + i] = i + 2;
            ans[3 * n - 1] = 1;
            for (int i = 0; i < n; i++)
                ans[3 * n + i] = i + 1;
            for (int i = 0; i < 4 * n; i++) {
                if (i > 0)
                    out.append(' ');
                out.append(ans[i]);
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}