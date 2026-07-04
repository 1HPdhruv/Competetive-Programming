import java.io.*;
import java.util.*;

public class cost {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();

            int[] match = new int[n];
            Arrays.fill(match, -1);
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    if (!stack.isEmpty()) {
                        int j = stack.pop();
                        match[j] = i;
                        match[i] = j;
                    }
                }
            }

            boolean[] removed = new boolean[n];
            int deletions = 0;
            for (int i = 0; i < n && deletions < k; i++) {
                if (s.charAt(i) == ')' && match[i] != -1) {
                    removed[i] = true;
                    deletions++;
                }
            }

            for (int i = 0; i < n; i++) {
                out.append(removed[i] ? '1' : '0');
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}