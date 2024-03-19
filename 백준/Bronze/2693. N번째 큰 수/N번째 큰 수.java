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
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        for( int i = 0; i<n; i++){
            int[] result = new int[10];
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<10; j++){
                result[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(result);           
            sb.append(result[7]).append("\n");    
        }
        System.out.print(sb);

        br.close();
	}
}