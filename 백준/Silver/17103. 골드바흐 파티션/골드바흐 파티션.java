import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        boolean[] primeArr = new boolean[1000001];
        primeArr[0] = primeArr[1] = true;

        for( int i = 2; i<=Math.sqrt(1000000); i++){
            for( int j = i*i; j<=1000000; j+=i){
                primeArr[j] = true;
            }
        }
        
        int n = Integer.parseInt(br.readLine());
        for( int i = 0; i<n; i++){
            int cnt = 0;
            int target = Integer.parseInt(br.readLine());
            for( int j = 2; j<=target/2; j++){
                if( !primeArr[j] && !primeArr[target-j]){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }      
        System.out.print(sb);
        br.close();
	}
}