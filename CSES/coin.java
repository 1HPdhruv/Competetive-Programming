import java.io.*;
import java.util.*;

public class coin {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long arr[] = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        long count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > count) {
                break;
            }
            count += arr[i];
        }
        System.out.println(count);
    }

}
