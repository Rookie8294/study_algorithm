import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int n, m, r, c, d, result;
    static int[][] room;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        room = new int[n][m];
        result = 1;
        
        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<m; j++){
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        dfs(r, c, d);
        
        System.out.print(result);
        
    }
    
    static void dfs(int y, int x, int d){
        //첫번째 칸은 항상 0이기때문에 청소해야한다.
        room[y][x] = -1;
        
        for(int i = 0; i<4; i++){
            d = (d+3)%4;
            int ny = y + dy[d];
            int nx = x + dx[d];
            if( ny >= 0 && nx >= 0 && ny < n && nx < m ){
                if( room[ny][nx] == 0){
                    result++;
                    dfs(ny, nx, d);
                    return;
                }
            }
        }
        
        //청소기가 뒤로 갔을때
        int back = (d+2)%4;
        int by = y + dy[back];
        int bx = x + dx[back];
        if( by >= 0 && bx >= 0 && by < n && bx < m && room[by][bx] != 1){
            dfs(by, bx, d);    
        }
                   
            
    }
        
}