import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main{
    static int n, m, h;
    static int[][][] box;
    static ArrayList<int[]> tomato;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        box = new int[h][m][n];
        tomato = new ArrayList<>();

        for( int k = 0; k<h; k++){
            for( int i = 0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                for( int j = 0; j<n; j++){
                    box[k][i][j] = Integer.parseInt(st.nextToken());
                    if( box[k][i][j] == 1 ){
                        tomato.add(new int[]{k, i, j});
                    }
                }
            }
        }

        bfs();

        int day = 0;
        boolean flag = false;
        for (int[][] box : box ){
            for( int[] arr : box){
                for (int i : arr){
                    if( i == 0 ){
                        flag = true;
                    }
                    day = Math.max(day, i);
                }
            }
        }

        if( flag ){
            System.out.println(-1);
        } else {
            System.out.println(day-1);
        }
        

        br.close();
	}
    
    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for( int[] tomato : tomato ){
            queue.offer(tomato);
        }

        int[] dz = {0, 0, 0, 0, +1, -1 };
        int[] dx = {1, 0, -1, 0, 0, 0};
        int[] dy = {0, -1, 0, 1, 0, 0};

        while ( !queue.isEmpty() ){
            int[] curIndex = queue.poll();
            int curZ = curIndex[0];
            int curY = curIndex[1];
            int curX = curIndex[2];
            for( int i = 0; i<6; i++){
                int nz = dz[i] + curZ;
                int ny = dy[i] + curY;
                int nx = dx[i] + curX;

                if( nz < 0 || nx < 0 || ny < 0 || nz >= h || nx >= n || ny >= m ) continue;
                if( box[nz][ny][nx] == 0 ){
                    box[nz][ny][nx] = box[curZ][curY][curX]+ 1;
                    queue.offer(new int[]{nz, ny, nx});
                }
            }

        }
    }
}