import java.util.*;

public class secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                ans.append(c);
            }
        }

        System.out.println(ans);
    }
}