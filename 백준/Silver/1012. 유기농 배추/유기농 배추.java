import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n,m,k;
    static int[][] field;
    static boolean[][] visited;

    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int cycle = Integer.parseInt(br.readLine());
        for( int i = 0; i<cycle; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            field = new int[n][m];
            visited = new boolean[n][m];
            for( int j = 0; j<k; j++ ){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] = 1;
            }

            int cnt = 0;
            for( int y = 0; y<n; y++){
                for( int x = 0; x<m; x++){
                    if( !visited[y][x] && field[y][x] == 1 ){
                        dfs(y, x);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

        }
	}
    static void dfs(int y, int x ){
        visited[y][x] = true;

        for( int i = 0; i<4; i++){
            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if( ny < 0 || nx < 0 || ny >= n || nx >= m ) continue;
            if( !visited[ny][nx] && field[ny][nx] == 1){
                dfs(ny, nx);
            }
        }
    }
}