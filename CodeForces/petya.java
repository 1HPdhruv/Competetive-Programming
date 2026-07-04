import java.util.*;

public class petya {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        if (a.compareTo(b) == 0)
            System.out.println("0");
        else if (a.compareTo(b) > 0)
            System.out.println("1");
        else
            System.out.println("-1");

    }
}