import java.io.*;
import java.util.*;

public class theatre {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long rows = (n + a - 1) / a;
        long cols = (m + a - 1) / a;
        long ans = rows * cols;
        System.out.println(ans);
    }
}
