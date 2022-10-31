public class while17 {
    public static void main(String[] args) {
        int N = 369;
		while (N > 0) {
            System.out.println(N % 10);
		    N /= 10;
		}
    }
}