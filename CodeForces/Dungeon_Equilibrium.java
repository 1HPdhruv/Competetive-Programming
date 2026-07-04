import java.util.*;
public class Dungeon_Equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
            int deletions = 0;
            for (int x : freq.keySet()) {
                int f = freq.get(x);
                if (f < x) deletions += f;
                else deletions += f - x;
            }
            System.out.println(deletions);
        }
    }
}