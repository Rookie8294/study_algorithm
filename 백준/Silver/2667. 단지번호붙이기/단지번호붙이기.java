import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main{

	static List<Integer> result;
    static boolean[][] chk;
    static int[][] map;
    static int cnt, n;
    static Stack<int[]> stack;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        chk = new boolean[n][n];
        result = new ArrayList<>();
        stack = new Stack<>();
        cnt = 1;

		// 입력받은 지도(행열)를 탐색하기위해 이차원배열에 추가해줍니다.
        for( int i = 0; i<n; i++){
            String[] arr = br.readLine().split("");
            for( int j = 0; j<n; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                if( map[i][j] == 1 && !chk[i][j]){
                    dfsUseStack(i, j);
                    result.add(cnt);
                    cnt=1;
                }
            }
        }   
        
        Collections.sort(result); // 오름차순 정렬
        sb.append(result.size()).append("\n");
        for( int i : result ){
            sb.append(i).append("\n");
        }
        
        System.out.print(sb);
	}
    
    static void dfsUseStack(int y, int x){
        chk[y][x] = true;
        stack.push(new int[]{y, x});
        int[] dy = {0,1,0,-1};
        int[] dx = {1,0,-1,0};

        while (!stack.isEmpty()){
            int[] arr = stack.pop();
            for( int i = 0; i<4; i++){
                int ny = arr[0] + dy[i];
                int nx = arr[1] + dx[i];
                if( ny >= 0 && nx >= 0 && ny < n && nx < n ){ //하지만 옆 노드가 없다면 탐색하지 않도록 조건
                    if( map[ny][nx] == 1 && chk[ny][nx] == false){
                        cnt++;
                        chk[ny][nx] = true;
                        stack.push(new int[]{ny, nx});
                    }
                }
            }
        }

    }
    
}