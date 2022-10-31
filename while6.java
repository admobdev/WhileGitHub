import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int a = n;
        int i = 1;

        while( n > 0) {
           i *= n;
           n -= 2;
            System.out.println(a + "!!= " + i);
        }
    }
}