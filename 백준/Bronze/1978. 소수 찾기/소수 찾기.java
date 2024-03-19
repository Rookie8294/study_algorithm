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
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            int target = Integer.parseInt(st.nextToken());
            boolean isPrime = false;
            
            if( target == 1 ){
                continue;
            }
            for( int j = 2; j<target; j++){
                if( target%j == 0 ){
                    isPrime = true;
                    break;
                }
            }
            
            if( !isPrime ){
                cnt++;
            }
        }
        
        System.out.print(cnt);
        

        br.close();
	}
}