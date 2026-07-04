import java.util.*;
public class pg1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        a=sc.nextInt();
        if(a%2==0&&a!=2&&a>0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}