import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int k = 0;
        while ((k + 1) * ( k + 1) < n) k++;
        System.out.println(" K= " + k);
        }
    }