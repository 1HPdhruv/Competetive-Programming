import java.io.*;

public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s != null)
            s = s.trim();
        s = s.toUpperCase();
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 0) {
                even += freq[i] / 2;
            } else {
                odd++;
                even += freq[i] / 2;
            }
        }
        if (odd > 1) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder s1 = new StringBuilder();
            String mid = "";
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    mid = String.valueOf((char) (i + 'A'));
                }
                for (int j = 0; j < freq[i] / 2; j++) {
                    s1.append((char) (i + 'A'));
                }
            }
            StringBuilder ans = new StringBuilder(s1);
            ans.append(mid);
            ans.append(s1.reverse());
            System.out.println(ans.toString());
        }

    }
}
