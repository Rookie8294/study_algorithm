import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static boolean[][] visited;
    static char[][] color;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, -1, 0, 1};
    static int n, cnt;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        color = new char[n][n];

        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j<n; j++){
                color[i][j] = line.charAt(j);
            }
        }

        cnt = 0;
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                if( !visited[i][j] ){
                    dfs(i, j, color[i][j]);
                    cnt++;
                }
            }
        }
        sb.append(cnt).append(" ");

        visited = new boolean[n][n];
        cnt = 0;
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                if( !visited[i][j] ){
                    dfsFilterRedGreen(i, j, color[i][j]);
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
        
        br.close();
	}
    
    static void dfsFilterRedGreen(int y, int x, char target){
        visited[y][x] = true;

        for( int i = 0; i<4; i++){
            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if( ny < 0 || nx < 0 || ny >= n || nx >= n ) continue;
            if( !visited[ny][nx] && color[ny][nx] == target ){
                dfsFilterRedGreen(ny, nx, target);
            } else if( !visited[ny][nx] && (target == 'R' || target == 'G') && (color[ny][nx] == 'R' || color[ny][nx] == 'G') ){
                dfsFilterRedGreen(ny, nx, color[ny][nx]);
            }
        }

    }

    static void dfs(int y, int x, char target){
        visited[y][x] = true;

        for( int i = 0; i<4; i++){
            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if( ny < 0 || nx < 0 || ny >= n || nx >= n ) continue;
            if( !visited[ny][nx] && color[ny][nx] == target ){
                dfs(ny, nx, color[ny][nx]);
            }
        }

    }
}