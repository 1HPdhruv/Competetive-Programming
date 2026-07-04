import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer>[] recv = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            recv[i] = new ArrayList<>();
        }

        for (int sender = 1; sender <= N; sender++) {
            int K = sc.nextInt();

            for (int j = 0; j < K; j++) {
                int receiver = sc.nextInt();
                recv[receiver].add(sender);
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(recv[i].size());

            for (int sender : recv[i]) {
                System.out.print(" " + sender);
            }

            System.out.println();
        }
    }
}