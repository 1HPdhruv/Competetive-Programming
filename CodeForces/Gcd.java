import java.io.*;
import java.util.*;

public class Gcd {
    static List<Long> divisors = new ArrayList<>();
    static List<Long> primes = new ArrayList<>();
    static List<Integer> exps = new ArrayList<>();

    static void gen(int idx, long cur) {
        if (idx == primes.size()) {
            divisors.add(cur);
            return;
        }

        long p = primes.get(idx);
        long val = 1;

        for (int i = 0; i <= exps.get(idx); i++) {
            gen(idx + 1, cur * val);
            val *= p;
        }
    }

    static class Node implements Comparable<Node> {
        int id;
        long dist;

        Node(int id, long dist) {
            this.id = id;
            this.dist = dist;
        }

        public int compareTo(Node o) {
            return Long.compare(dist, o.dist);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long g = gcd(a, b);
        long A = a / g;
        long B = b / g;
        long M = A * B;

        long tmp = M;
        for (long p = 2; p * p <= tmp; p++) {
            if (tmp % p == 0) {
                int cnt = 0;
                while (tmp % p == 0) {
                    tmp /= p;
                    cnt++;
                }
                primes.add(p);
                exps.add(cnt);
            }
        }
        if (tmp > 1) {
            primes.add(tmp);
            exps.add(1);
        }

        gen(0, 1);
        Collections.sort(divisors);

        int m = divisors.size();

        HashMap<Long, Integer> id = new HashMap<>();
        for (int i = 0; i < m; i++)
            id.put(divisors.get(i), i);

        long[] dist = new long[m];
        Arrays.fill(dist, Long.MAX_VALUE);

        int s = id.get(A);
        int t = id.get(B);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[s] = 0;
        pq.add(new Node(s, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.dist != dist[cur.id])
                continue;

            long d = divisors.get(cur.id);

            for (long p : primes) {
                if (d % p != 0)
                    continue;

                long pw = p;
                while (d % pw == 0) {
                    long nd = d / pw;
                    int to = id.get(nd);

                    if (dist[to] > cur.dist + pw) {
                        dist[to] = cur.dist + pw;
                        pq.add(new Node(to, dist[to]));
                    }

                    pw *= p;
                }
            }
        }

        System.out.println(dist[t]);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}