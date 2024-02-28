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
        int[][] graph = new int[n][n];

        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for( int k = 0; k<n; k++ ){
            for( int i = 0; i<n; i++){
                for( int j = 0; j<n; j++){
                    if( graph[i][k] == 1 && graph[k][j] == 1){
                        graph[i][j] = 1;
                    }
                }
            }
        }

        for( int[] arr : graph){
            for( int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
	}
}