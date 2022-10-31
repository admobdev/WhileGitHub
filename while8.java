import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int h ;
        int i = 0;
        int k = 1;
        do {
            i++;
            k = i * i;
            if (k > n);
            {
                h = --i;
                break;
            }
        }
        while (true);{
            System.out.println(h + " ^<= " + n);
        }
    }
}