import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    
    static boolean[][] visited;
    static int[][] land;
    static int w, h, cnt;

    static int[] dy = {0,1,0,-1,1,-1,1,-1};
    static int[] dx = {1,0,-1,0,1,1,-1,-1};
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        cnt = 0;
        while ( !(w == 0 && h == 0) ){
            //land 세팅
            land = new int[h][w];
            visited = new boolean[h][w];
            for( int i = 0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j<w; j++){
                    land[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for( int i = 0; i<land.length; i++){
                for( int j = 0; j<land[i].length; j++){
                    if( !visited[i][j] && land[i][j] == 1 ){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            cnt = 0;
        }

        br.close();
	}
    
     static void dfs(int y, int x){
        visited[y][x] = true;

        for( int i = 0; i<8; i++){
            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if( ny < 0 || nx < 0 || ny >= h || nx >= w ) continue;
            if( !visited[ny][nx] && land[ny][nx] == 1 ){
                dfs(ny, nx);
            }
        }

    }
}