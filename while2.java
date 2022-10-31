import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a sonini kiriting: ");
        int a = sc.nextInt();

        System.out.print("b sonini kiriting: ");
        int b = sc.nextInt();

        int count = 0;
        do {
            a -= b;
            count++;
        }
        while (a >= b);
        System.out.println("A sonida b sonidan " + count + " ta joylash mumkin !!");
    }
}
