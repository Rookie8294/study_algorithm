import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    
    static boolean[][] visited;
    static int[][] zone;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,-1,0,1};
    static int n, target;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        zone = new int[n][n];
        int max = 0;
        for( int i = 0; i<n; i++ ){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(max, num);
                zone[i][j] = num;
            }
        }

        int cnt = 0;
        int maxCnt = 0;
        for( int k = 0; k<=max; k++){
            target = k;
            for( int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if( zone[i][j] > target && !visited[i][j]){
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            maxCnt = Math.max(maxCnt, cnt);
            cnt = 0;
            visited = new boolean[n][n];
        }

        System.out.println(maxCnt);
        
        br.close();
	}
    
    static void dfs(int y, int x){
        visited[y][x] = true;

        for( int i = 0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if( ny >= 0 && ny < n && nx >= 0 && nx < n ){
                if( zone[ny][nx] > target && !visited[ny][nx]){
                    dfs(ny,nx);
                }
            }
        }
    }
}