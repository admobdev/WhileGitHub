import java.util.Scanner;

public class while9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int l = n;
        int k = 0;

        do {
            n /= 3;
            k++;
        }
        while(n >= 1); {
            System.out.println(" 3 ^" + k + " = " + l);
        }
    }
}