import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int[] dp = new int[45];
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        System.out.print(fib(n));

        br.close();
	}
    
    static int fib(int n){
        dp[0] = 1;
        dp[1] = 1;
        
        for( int i = 2; i<n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n-1];
    }
}
