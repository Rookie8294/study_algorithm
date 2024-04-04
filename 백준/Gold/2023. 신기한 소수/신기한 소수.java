import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n;
    static int[] startPrime = {2, 3, 5, 7};
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());

        for( int i = 0; i<startPrime.length; i++){
            recur(startPrime[i], 1);
        }

        System.out.print(sb);
        
        br.close();
	}
    static void recur(int num, int depth){
        if( depth == n ){
            sb.append(num).append("\n");
            return;
        }

        for( int i = 0; i<10; i++){
            int target = num * 10 + i;
            boolean isPrime = true;
            for( int j = 2; j<=Math.sqrt(target); j++){
                if( target % j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if( isPrime ) recur(target, depth+1);

        }
    }
}