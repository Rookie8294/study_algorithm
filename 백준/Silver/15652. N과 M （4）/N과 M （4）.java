import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n, m;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        result = new int[m];

        dfs(1,0);
        System.out.print(sb);
        br.close();
	}
    
    static void dfs(int start, int depth){
        if( depth == m ){
            for( int i : result ){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for( int i = start; i<=n; i++){
            result[depth] = i;
            dfs(i , depth + 1);
        }
    }
}