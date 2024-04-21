import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int t, n, m;
    static int[][] graph;
    static boolean[] visited;
    static int result;
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());

        for( int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            graph = new int[n + 1][n + 1];
            visited = new boolean[n + 1];
            result = 0;

            for( int j = 0; j<m; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x][y] = graph[y][x] = 1;
            }
            
            bfs();
            sb.append(result-1).append("\n");
        }
        
        System.out.print(sb);

	}
    
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            result++;
            int cur = queue.poll();

            for( int i = 1; i<=n; i++){
                if( graph[cur][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}