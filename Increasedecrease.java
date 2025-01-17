package pattern;

import java.util.Scanner;

public class Increasedecrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        operation(n);
    }
    public static int operation(int n){
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=1;j<i;j++){
                System.out.print(p++ +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p--+" ");
            }
            System.out.println();
        }
        return n;
    }
}
