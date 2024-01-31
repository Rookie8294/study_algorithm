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
        
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt][2];
        
        for( int i = 0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (a1, a2)->{
            if( a1[1] == a2[1] ){
                return a1[0] - a2[0];
            } else {
                return a1[1] - a2[1];
            }
        });
        
        for( int i = 0; i<cnt; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
            
        System.out.print(sb);
         

        br.close();
	}
}