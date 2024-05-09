import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int n, m, cnt;
    static int[][] northPole;
    static boolean[][] visited;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        northPole = new int[n][m];

        int result = 0;

        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<m; j++){
                northPole[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        while (true){
            int iceberg = 0;
            visited = new boolean[n][m];
            for( int i = 0; i<n; i++){
                for( int j = 0; j<m; j++){
                    if (!visited[i][j] && northPole[i][j] != 0) {
                        iceberg++;
                        dfs(i,j);
                    }
                }
            }


            cnt++;
            if( iceberg >= 2){
                result = cnt-1;
                break;
            } else if( iceberg == 0){
                result = 0;
                break;
            }


        }//end while


        System.out.print(result);
	
    }
    
    static void dfs(int y, int x){
         visited[y][x] = true;

        for( int i = 0 ; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if( ny >= n || nx >= m || ny < 0 || nx < 0) continue;
            if( northPole[ny][nx] == 0 && northPole[y][x] != 0 && !visited[ny][nx] ) northPole[y][x]--;
            if( !visited[ny][nx] && northPole[ny][nx]!=0){
                dfs(ny, nx);
            }
        }

    }

}