import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    static int n, m, k, area, cnt;
    static int[][] graph;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        cnt = 1;
        List<Integer> list = new ArrayList<>();
        graph = new int[n][m];


        for(int i = 0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());

            for( int j = start_y; j<end_y; j++){
                for( int l = start_x; l<end_x; l++){
                    graph[j][l] = 1;
                }
            }
        }

        for( int i = 0; i<n; i++){
            for( int j = 0; j<m; j++){
                if( graph[i][j] != 1){
                    dfs(i, j);
                    list.add(cnt);
                    cnt = 1;
                    area++;
                }
            }
        }

        Collections.sort(list); // 오름차순 정렬

        sb.append(area).append("\n");
        for (int i : list) sb.append(i).append(" ");

        System.out.println(sb);
        

        br.close();
	}
    
    static void dfs(int y, int x){

        graph[y][x] = 1; //방문 처리

        for(int i = 0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if( ny >= n || nx >= m || ny < 0 || nx < 0 ) continue;
            if( graph[ny][nx] != 1 ){
                dfs(ny, nx);
                cnt++;
            }
        }
    }
}