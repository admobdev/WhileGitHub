import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N sonini kiriting: ");
        int n = sc.nextInt();

        System.out.print("K sonini kiriting: ");
        int k = sc.nextInt();

        int u = n;
        int i = 0;

        do {
            n -= k;
            i++;
        }
        while (n >= k);
        System.out.println( u +  " / " +  k + " = " + i);
        System.out.println( u  + " % " +  k + " = " + n);
    }
}
