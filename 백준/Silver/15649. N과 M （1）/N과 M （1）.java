import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main{
    
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0);

        System.out.println(sb);

        br.close();
	}
    
    static void dfs( int n, int m, int depth){
        if( m == depth ){
            for( int num : arr ){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for( int i = 0; i<n; i++){
            if( !visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }
}