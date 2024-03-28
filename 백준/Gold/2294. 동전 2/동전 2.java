import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[k+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for( int i = 0; i<n; i++){
            int coin = Integer.parseInt(br.readLine());
            for( int j = coin; j<=k; j++){
                dp[j] = Math.min(dp[j], dp[j - coin]+1);
            }
        }
        
        System.out.print(dp[k] == 10001 ? -1 : dp[k]);

        br.close();
	}
}