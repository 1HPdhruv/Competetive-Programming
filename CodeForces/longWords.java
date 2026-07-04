import java.io.*;
import java.util.*;

public class longWords {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int len = s.length();
            if (len > 10) {
                System.out.print(s.charAt(0));
                System.out.print(len - 2);
                System.out.println(s.charAt(len - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}