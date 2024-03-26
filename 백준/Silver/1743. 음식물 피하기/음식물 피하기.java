import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, -1, 0, 1};
    static int[][] graph;
    static int n, m, k, cnt;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        graph = new int[n][m];

        for( int i = 0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            graph[y-1][x-1] = -1;
        }

        int max = 1;
        for( int i = 0; i<n; i++){
            for( int  j = 0; j<m; j++){
                if( graph[i][j] == -1 ){
                    dfs(i, j);
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
            }
        }

        System.out.println(max);

        br.close();
	}
    static void dfs(int y, int x){
        graph[y][x] = 1;
        cnt++;

        for( int i = 0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if( ny < 0 || nx < 0 || ny >= n || nx >= m ) continue;
            if( graph[ny][nx] == -1 ){
                dfs(ny, nx);
            }
        }
    }
}