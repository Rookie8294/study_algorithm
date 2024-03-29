import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    
    static int n, cnt;
    static int[] fibArr;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        fibArr = new int[n];
        
        cnt = 0;
        fib(n);
        sb.append(cnt).append(" ");
        
        cnt = 0;
        fibonacci(n);
        sb.append(cnt);
        
        System.out.print(sb);
        br.close();
	}
    
    static int fib(int n){
        if( n == 1 || n == 2){
            cnt++;
            return 1;
        } else {
            return fib(n -1) + fib(n - 2);
        }
    }
    
    static void fibonacci(int n ){
        fibArr[0] = 1;
        fibArr[1] = 1;
        
        for( int i = 2; i<n; i++){
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
            cnt++;
        }
    }
}