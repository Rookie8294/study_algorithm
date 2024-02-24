import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int[][] visited;
    static int[][] maze;
    static int n;
    static int m;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        maze = new int[n][m];
        visited = new int[n][m];

        for( int i = 0; i<n; i++){
            String[] arr = br.readLine().split("");
            for( int j = 0; j<m; j++){
                maze[i][j] = Integer.parseInt(arr[j]);
            }
        }

        bfs(0,0);
        
        System.out.print(visited[n-1][m-1]);
        br.close();
	}
    static void bfs(int y, int x){
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x] = 1;
        queue.offer(new int[]{y,x});

        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        while (!queue.isEmpty()){
            int[] currentIndex = queue.poll();
            for( int i = 0; i<4; i++){
                int nx = dx[i] + currentIndex[1];
                int ny = dy[i] + currentIndex[0];

                if( ny >= 0 && nx >= 0 && ny < n && nx < m ){
                    if( visited[ny][nx] == 0 && maze[ny][nx] == 1){
                        visited[ny][nx] = visited[currentIndex[0]][currentIndex[1]] +1;
                        queue.offer(new int[]{ny,nx});
                    }
                }
            }
        }
    }
}