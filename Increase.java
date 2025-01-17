import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        operation(n);

    }

    public static int operation(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = n-i; j >= i; j--) {
                System.out.print(j + " ");
            }
            break;
        }
        return n;
    }
}
