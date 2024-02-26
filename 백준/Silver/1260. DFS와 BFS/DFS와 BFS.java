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
    static ArrayList<Integer> list[];
    static StringBuilder sb;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for( int i = 0; i<list.length; i++){
            list[i] = new ArrayList<>();
        }
        for( int i = 0; i<m; i++ ){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            list[y].add(x);
            list[x].add(y);
        }
        
        for( int i = 0; i<list.length; i++){
            Collections.sort(list[i]);
        }

        dfs(v);
        visited = new boolean[n + 1];
        sb.append("\n");
        bfs(v);

        System.out.println(sb);
        

        br.close();
	}
    
    static void dfs(int v){
        visited[v] = true;
        sb.append(v).append(" ");
        for( int i : list[v]){
            if( !visited[i] ){
                dfs(i);
            }
        }
    }

    static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;

        queue.offer(v);
        sb.append(v).append(" ");
        while (!queue.isEmpty()){
            int idx = queue.poll();
            for (int i : list[idx]) {
                if( !visited[i] ){
                    queue.offer(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }


    }
}