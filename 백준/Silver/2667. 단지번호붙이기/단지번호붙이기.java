import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

	static List<Integer> result;
    static boolean[][] chk;
    static int[][] map;
    static int cnt, n;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        chk = new boolean[n][n];
        result = new ArrayList<>();
        cnt = 1;

        for( int i = 0; i<n; i++){
            String[] arr = br.readLine().split("");
            for( int j = 0; j<n; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                if( map[i][j] == 1 && !chk[i][j] ){
                    dfs(i, j); // dfs 호출
                    result.add(cnt);
                    cnt = 1;
                }
            }
        }    
        Collections.sort(result);
        sb.append(result.size()).append("\n");
        for( int i : result ){
            sb.append(i).append("\n");
        }
        
        System.out.print(sb);
	}
    
    static void dfs(int y, int x){
        chk[y][x] = true;
        int[] dy = {0,1,0,-1};
        int[] dx = {1,0,-1,0};
        for( int i = 0; i<4; i++){ // 4방향의 노드를 모두 탐색
            int ny = y + dy[i];
            int nx = x + dx[i];
            if( ny >= 0 && nx >= 0 && ny < n && nx < n ){ //인접한 노드가 없다면 탐색하지 않습니다.
                if( map[ny][nx] == 1 && chk[ny][nx] == false){
                    cnt++;
                    dfs(ny, nx);
                }
            }
        }
    }
    
}