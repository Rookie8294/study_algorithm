import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    
    static int[][] arr, dp;
    static int red, green, blue;
    static int n;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n][3];

        red = 0;
        green = 1;
        blue = 2;

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][red] = Integer.parseInt(st.nextToken());
            arr[i][green] = Integer.parseInt(st.nextToken());
            arr[i][blue] = Integer.parseInt(st.nextToken());
        }

        //재귀호출
        dp = new int[n][3];
        dp[0][red] = arr[0][red];
        dp[0][green] = arr[0][green];
        dp[0][blue] = arr[0][blue];

        System.out.println(Math.min(Math.min(recur(red, n - 1), recur(green, n - 1)), recur(blue, n - 1)));

        br.close();
	}
    static int recur(int color, int n){

        if( dp[n][color] == 0 ){
            if( color == red ){
                dp[n][red] = Math.min(recur(green, n-1), recur(blue, n-1)) + arr[n][red];
            } else if( color == green){
                dp[n][green] = Math.min(recur(red, n-1), recur(blue, n-1)) + arr[n][green];
            } else {
                dp[n][blue] = Math.min(recur(red, n-1), recur(green, n-1)) + arr[n][blue];
            }
        }

        return dp[n][color];

    }
}