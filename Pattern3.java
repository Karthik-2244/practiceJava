import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        operation1(n);

    }

    public static int operation1(int n) {
        for(int i=1;i<=n;i++){
            for(int spaces =1; spaces<=i-1;spaces++){
                System.out.print(" ");
            }
            for(int j=i;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int spaces=1;spaces<=n-i-1;spaces++){
                System.out.print(" ");
            }
            for(int j=n-i;j==n-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return n;
    }

}

