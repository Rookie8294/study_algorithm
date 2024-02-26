import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n;
    static int m;
    static boolean[] visited;
    static int[][] graph;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        graph = new int[n+1][n+1];
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            
            graph[y][x] = 1;
            graph[x][y] = 1;
        }
        
        int cnt = 0;
        for( int i = 1; i<=n; i++){
            if( !visited[i] ){
                dfs(i);
                cnt++;
            }
        }   

        System.out.print(cnt);
        br.close();
	}
    
    static void dfs(int idx){
        if( visited[idx] ){
            return;
        }
        
        visited[idx] = true;
        for( int i = 1; i<=n; i++){
            if( graph[idx][i] == 1){
                dfs(i);
            }
        }
    }
}