package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N28065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        arr[0] = 1;
        int distance = N-1;
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i - 1] - distance;
                distance--;
            } else {
                arr[i] = distance + arr[i - 1];
                distance--;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[N - 1]);
    }
}
