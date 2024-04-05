
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    static int[][] gameMap;
    static int[][] visited;
    static int n, m;
    public int solution(int[][] maps) {        
        n = maps.length;
        m = maps[0].length;

        visited = new int[n][m];
        gameMap = maps;                                  
        
        bfs(0,0);
        int answer = visited[n-1][m-1];
        if( answer == 0 ){
            answer = -1;
        }
            
        return answer;
    }
    static void bfs(int y, int x){    
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {y,x});
        visited[y][x] = 1;
                
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, -1, 0, 1};
        
        while( !queue.isEmpty()){
            int[] indexArr = queue.poll();
            int curY = indexArr[0];
            int curX = indexArr[1];
            
            if( curY == (n-1) && curX == (m-1)) return;
            
            for( int i = 0; i<4; i++){
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                
                if( ny < 0 || nx < 0 || ny >= n || nx >= m ) continue;
                if( gameMap[ny][nx] == 1 && visited[ny][nx] == 0 ){
                    queue.offer(new int[] {ny, nx});
                    visited[ny][nx] = visited[curY][curX] + 1;
                }
            
            }
            
            
        }
        
    }
}