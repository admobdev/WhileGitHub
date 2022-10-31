import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int N = sc.nextInt();
        int sum = 0, num = 0;
		while (N > 0) {
			num = num + 1;
			sum = sum + N % 10;
			N = N / 10;
		}
		System.out.println(num);
		System.out.println(sum);
    }
}