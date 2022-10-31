import java.util.Scanner;

public class while21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int N = sc.nextInt();
        boolean flag = false;
        while (N > 0) {
            if (N % 2 != 0) {
                flag = true;
                break;
            }
            N = N / 10;
        }
        System.out.println(flag);
        }
    }