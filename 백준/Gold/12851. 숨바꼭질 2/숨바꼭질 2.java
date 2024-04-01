import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    static int n, k;
    static int cnt = 0;
    static int minTime = 987654321;
    static int[] road;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        road = new int[100001];
        
        if( n >= k ){
            System.out.println((n - k) + "\n1");
            return;
        }
        bfs();

        System.out.println(minTime);
        System.out.println(cnt);
        br.close();
	}
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        road[n] = 1;
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            
            if( minTime < road[now] ) return;
            
            for( int i = 0; i<3; i++){
                int next = 0;
                switch(i){
                    case 0 : next = now + 1; break;
                    case 1 : next = now - 1; break;
                    case 2 : next = now * 2; break;
                }
                
                if( next == k ){
                    minTime = road[now];
                    cnt++;
                }
                
                if( next < 0 || next > 100000) continue;
                
                if( road[next] == 0 || road[next] == road[now] + 1 ){
                    road[next] = road[now] + 1;
                    queue.offer(next);
                }
            }
        }
    }
}