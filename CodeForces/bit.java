import java.util.*;

public class bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("++"))
                x++;
            else if (s.contains("--"))
                x--;
        }
        System.out.println(x);
        sc.close();
    }
}
