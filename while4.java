import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N sonini kiriting: ");
        int n = sc.nextInt();

        int a = 1;

        while(a < n) {
            a *= 3;
        }
        if (n == a) {
            System.out.println("3 - ning darajasi ");
        }else {
            System.out.println("3 - ning darajasi emas ");
        }
    }
}
