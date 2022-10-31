import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a sonini kiriting: ");
        int a = sc.nextInt();

        System.out.print("b sonini kiriting: ");
        int b = sc.nextInt();

        do {
            a -= b;
        }
        while (a >= b);
        System.out.println("A ning bo'sh qismi: " + a);
    }
}