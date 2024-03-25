import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class Main{
    static int n, m, v;
    static boolean[] visited;
    static ArrayList<Integer> graph[];
    static StringBuilder sb;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        //그래프 초기화
        graph = new ArrayList[n+1];
        for( int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for( int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph[a].add(b);
            graph[b].add(a);
        }
        for( int i = 0; i<graph.length; i++){
            Collections.sort(graph[i]);
        }
        
        dfs(v);
        visited = new boolean[n+1];
        sb.append("\n");
        bfs(v);
        
        System.out.print(sb);
        
	}
    static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        for( int i : graph[start]){
            if( !visited[i] ){
                dfs(i);
            }
        }
    }
    
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        
        sb.append(start).append(" ");
        while( !queue.isEmpty() ){
            int idx = queue.poll();
            for( int i : graph[idx]){
                if( !visited[i]){
                    visited[i] = true;
                    sb.append(i).append(" ");
                    queue.offer(i);
                }
            }
        }
    }
   
}