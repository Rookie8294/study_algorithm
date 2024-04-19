import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
    static int n, m, start, end;
    static int[] distance;
    static int[][] degrees;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        
        distance = new int[n+1];
        degrees = new int[n+1][n+1];
        
        for( int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            degrees[x][y] = degrees[y][x] = 1;
        }
        
        bfs(start);
        
        System.out.print(distance[end] == 0? -1 : distance[end]);
        
        br.close();
	}
    
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        
        while(!queue.isEmpty()){
            int idx = queue.poll();
            
            if( idx == end ) break;
            
            for( int i = 1; i<=n; i++){
                if( degrees[idx][i] == 1 && distance[i] == 0 ){
                    queue.offer(i);
                    distance[i] = distance[idx] + 1;
                }
            }
           
        }
    }
}