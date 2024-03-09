import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n, cnt;
    static int[][] board;

    static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                board[i][j] = -1;
            }
        }

        dfs(0);

        System.out.println(cnt);
        
        br.close();
	}
    static void dfs(int depth){

        if( depth == n){
            cnt++;
            return;
        }

        for( int i = 0; i<n; i++){
                if( board[depth][i] < 0){
                    attack(depth, i, 1);
                    dfs(depth + 1);
                    attack(depth, i, -1);
                }
        }

    }
    
    static void attack(int y, int x, int flag){
        for( int k = 1; k<n; k++){
            for( int l = 0; l<8; l++){
                int nx = x + ( k * dx[l] );
                int ny = y + ( k * dy[l] );
                if( nx < 0 || ny < 0 || nx >= n || ny >= n ) continue;
                board[ny][nx] += flag;
            }
        }
        board[y][x] += flag;
    }
}