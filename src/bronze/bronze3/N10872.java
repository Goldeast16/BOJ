package bronze.bronze3;

import java.util.Scanner;

public class N10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;

        if (N != 0) {
            for (int i = 1; i <= N; i++) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
