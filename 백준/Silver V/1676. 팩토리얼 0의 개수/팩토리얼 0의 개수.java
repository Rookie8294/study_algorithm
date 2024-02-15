import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        BigInteger factorial = BigInteger.ONE;
        for( int i = 1; i<=N; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String target = String.valueOf(factorial);

        int cnt = 0;
        for(int i = target.length()-1; 0<=i; i-- ){
            char c = target.charAt(i);
            if( c == '0'){
                cnt++;
            } else{
                break;
            }
        }
        System.out.print(cnt);
        br.close();
	}
}