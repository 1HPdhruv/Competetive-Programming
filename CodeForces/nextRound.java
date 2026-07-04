import java.io.*;
import java.util.*;

public class nextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int aK = a[k - 1];
        for (int i = 0; i < n; i++) {
            if (a[i] >= aK && a[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}