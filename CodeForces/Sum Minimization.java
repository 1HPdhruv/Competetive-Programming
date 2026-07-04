import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextLong();
            }
            long remainder = sum % n;
            if (remainder == 0) {
                System.out.println(sum);
            } else if (n == 2) {
                System.out.println(sum - remainder);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
