import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Spiral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long t = Long.parseLong(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long c = 0;
            if (y > x) {
                if (y % 2 == 0)
                    c = y * y - x + 1;
                else
                    c = (y - 1) * (y - 1) + x;
            } else {
                if (x % 2 == 0)
                    c = (x - 1) * (x - 1) + y;
                else
                    c = x * x - y + 1;
            }
            System.out.println(c);
        }
    }
}
