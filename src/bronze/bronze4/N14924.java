package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N14924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        double time = (double) D / (S * 2);
        System.out.println((int) time*T);

    }
}
