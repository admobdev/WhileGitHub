import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int l = n;
        int k = 0;

        do {
            n /= 2;
            k++;
        }
        while(n >= 1); {
            System.out.println(" 2 ^" + k + " = " + l);
        }
    }
}