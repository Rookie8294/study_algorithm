import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{
    
    static int[] visited;
    static ArrayList<Integer>[] friends;

    public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
         StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new int[n+1];
        friends = new ArrayList[n + 1];
        for( int i = 1; i<=n; i++){
            friends[i]=(new ArrayList<Integer>());
        }

        for( int i = 1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            friends[x].add(y);
            friends[y].add(x);
        }
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for( int i = 1; i<=n; i++){
            int cnt = bfs(i);
            if( min > cnt ){
                min = cnt;
                minIdx = i;
            }
        }

        System.out.println(minIdx);

        br.close();
	}
    
    static int bfs(int start){
        Arrays.fill(visited,-1);
        visited[start] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        int cnt = 0;
        while (!queue.isEmpty()){
            int idx = queue.poll();
            for( int i : friends[idx]){
                if( visited[i] == -1 ){
                    queue.offer(i);
                    visited[i] = visited[idx] + 1;
                    cnt += visited[i];
                }
            }
        }

        return cnt;

    }
}