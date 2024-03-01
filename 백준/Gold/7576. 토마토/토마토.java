import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int[][] box;
    static ArrayList<int[]> indexList;
    static int n, m;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n + 1][m + 1];
        indexList = new ArrayList<>();

        for( int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 1; j<=m; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if( box[i][j] == 1 ){
                    indexList.add(new int[]{i, j});
                }
            }
        }

        bfs();

        boolean flag = false;
        int day = 0;
        for( int i = 1; i<=n; i++){
            for( int j = 1; j<=m; j++){
                if( box[i][j] == 0 ) {
                   flag = true;
                }
                day = Math.max(day, box[i][j]);
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
        if( indexList.isEmpty() ){
            return;
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int[] index : indexList){
            queue.offer(index);
        }

        while ( !queue.isEmpty() ){

            int[] index = queue.poll();
            int curY = index[0];
            int curX = index[1];
            for( int j = 0; j<4; j++){
                int ny = dy[j] + curY;
                int nx = dx[j] + curX;

                if( ny < 1 || nx < 1 || ny > n || nx > m) continue;
                if( box[ny][nx] == 0 ){
                    box[ny][nx] = box[curY][curX] + 1;
                    queue.offer(new int[]{ny,nx});
                }
            }
        }

    }
}