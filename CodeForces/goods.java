import java.io.*;
import java.util.*;

public class goods {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tstCNum = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (tstCNum-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(st.nextToken());

            List<Integer> bad = new ArrayList<>();
            for (int i = 0; i + 1 < n; i++) {
                if (a[i] != a[i + 1]) {
                    bad.add(i);
                    bad.add(i + 1);
                }
            }

            if (bad.isEmpty()) {
                out.append("YES\n");
                continue;
            }

            Set<Integer> candSet = new LinkedHashSet<>(bad);
            List<Integer> cands = new ArrayList<>(candSet);

            boolean found = false;

            if (check(a, n, -1, -1)) {
                found = true;
            }

            if (!found) {
                for (int ci = 0; ci < cands.size() && !found; ci++) {
                    for (int cj = ci + 1; cj < cands.size() && !found; cj++) {
                        int pi = cands.get(ci), pj = cands.get(cj);
                        if (check(a, n, pi, pj))
                            found = true;
                    }
                }
            }

            out.append(found ? "YES\n" : "NO\n");
        }
        System.out.print(out);
    }

    static boolean check(int[] a, int n, int pi, int pj) {
        int[] b = Arrays.copyOf(a, n);
        if (pi != -1) {
            int tmp = b[pi];
            b[pi] = b[pj];
            b[pj] = tmp;
        }
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < n; i++) {
            first.putIfAbsent(b[i], i);
            last.put(b[i], i);
        }
        for (int v : first.keySet()) {
            int fi = first.get(v), li = last.get(v);
            for (int i = fi; i <= li; i++) {
                if (b[i] != v)
                    return false;
            }
        }
        return true;
    }
}