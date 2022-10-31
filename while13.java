import java.util.Scanner;

public class while13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini: ");
        int n = sc.nextInt();

        int l = n;
        int k = 0;

        do {
            n += 1;
            k+=n;
        }
        while(n >= 1); {
            System.out.println(" 2 ^" + k + " = " + l);
            System.out.println(k);
        }
    }
}











































/*{
    print("*****Example While13()*********<br>");

    $A=3;
    print("A=".$A."<br>");
    $S=0;
    $i=0;
    do
    {
        $i++;
        $S+=1/$i;
        if($S>=$A) break;
        print($i." S=".$S."<br>");
    }
    while(true);
}*/