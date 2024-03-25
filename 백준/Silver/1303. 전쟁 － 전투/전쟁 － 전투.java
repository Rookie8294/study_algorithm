import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n , m, cnt;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        cnt = 0;
        graph = new char[m][n];
        visited = new boolean[m][n];

        for( int i = 0; i<m; i++){
            String line = br.readLine();
            for( int j = 0; j<n; j++){
                graph[i][j] = line.charAt(j);
            }
        }

        int white = 0;
        for( int i = 0;i<m; i++){
            for( int j = 0; j<n; j++){
                if( !visited[i][j] && graph[i][j] == 'W'){
                    dfs(i, j, 'W');
                    white += cnt * cnt;
                    cnt = 0;
                }
            }
        }
        visited = new boolean[m][n];
        int blue = 0;
        for( int i = 0;i<m; i++){
            for( int j = 0; j<n; j++){
                if( !visited[i][j] && graph[i][j] == 'B'){
                    dfs(i, j, 'B');
                    blue += cnt * cnt;
                    cnt = 0;
                }
            }
        }

        sb.append(white).append(" ").append(blue);

        System.out.println(sb);
        

        br.close();
	}
    
    static void dfs(int y, int x, char target){
        visited[y][x] = true;
        cnt++;

        for( int i = 0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if( nx < 0 || ny < 0 || nx >= n || ny >= m ) continue;
            if( !visited[ny][nx] && graph[ny][nx] == target ){
                dfs(ny, nx, target);
            }
        }

    }
}