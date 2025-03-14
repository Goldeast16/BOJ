package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int nFac = 1;
        int kFac = 1;
        int nmkFac = 1;

        for (int i = 1; i <= N; i++) {
            nFac *= i;
        }
        for (int i = 1; i <= K; i++) {
            kFac *= i;
        }
        for (int i = 1; i <= N - K; i++) {
            nmkFac *= i;
        }
        int result = nFac / (kFac * nmkFac);
        System.out.println(result);
    }
}
