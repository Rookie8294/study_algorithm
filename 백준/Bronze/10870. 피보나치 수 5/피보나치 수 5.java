import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static Integer[] dp;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        dp[0] = 0;

        System.out.println(fib(n));

        br.close();
	}
    
  
    static int fib(int n ){
        if( dp[n] != null ){
            return dp[n];
        }

        if( n == 1 || n == 2 ){
            return 1;
        }

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }
}