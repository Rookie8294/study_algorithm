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

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[target+1];

            arr[0] = true;
            arr[1] = true;
            for( int j = 2; j<=Math.sqrt(target); j++){
                if( arr[j] ){
                    continue;
                }
                for( int k = j*j; k<=target; k+=j){
                    arr[k] = true;
                }
            }

            int cnt = 0;
            for( int j = 2; j<arr.length/2+1; j++){
                if( !arr[j] && !arr[target-j]){
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }
        System.out.print(sb);       
        br.close();
	}
}