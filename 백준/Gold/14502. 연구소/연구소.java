import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.StringBuilder;

public class Main{
    static int n, m, safetyZone;
    static int[][] lab;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
         StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        lab = new int[n][m];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<m; j++){
                lab[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(safetyZone);
	}
    
    static void dfs(int depth){
        if( depth == 3 ){
            bfs();
            return;
        }

        for( int i = 0; i<n; i++){
            for( int j = 0; j<m; j++){
                if( lab[i][j] == 0){
                    lab[i][j] = 1;
                    dfs(depth + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    //바이러스 퍼트리기
    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();

        // 바이러스를 퍼트리기위해 복사
        int[][] copyLab = new int[n][m];
        for( int i = 0; i<n; i++){
            copyLab[i] = lab[i].clone();
        }

        //바이러스 위치 큐에 저장
        for( int i = 0; i<n; i++){
            for( int j = 0; j<m; j++){
                if( lab[i][j] == 2 ){
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curY = current[0];
            int curX = current[1];

            for( int i = 0; i<4; i++){
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if( ny >= n || nx >= m || nx < 0 || ny < 0) continue;
                if( copyLab[ny][nx] == 0 ){
                    queue.offer(new int[]{ny, nx});
                    copyLab[ny][nx] = 2;
                }
            }
        }

        int cnt = 0;
        for( int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if( copyLab[i][j] == 0 ){
                    cnt++;
                }
            }
        }
        safetyZone = Math.max(safetyZone, cnt);

    }
}