import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int n, m, result;
    static char[][] board;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new char[n][m];
        result = -1;

        Coin firstCoin = null;
        Coin secondCoin = null;
        for( int i = 0; i<n; i++){
            String line = br.readLine();
            for( int j = 0; j<m; j++){
                char c = line.charAt(j);
                if( firstCoin != null && c == 'o' ){
                    secondCoin = new Coin(i, j);
                }
                if( firstCoin == null && c == 'o'){
                    firstCoin = new Coin(i, j);
                }

                board[i][j] = c;
            }
        }

        bfs(firstCoin, secondCoin);

        System.out.println(result);
        

        br.close();
	}
    static class Coin{
        int y;
        int x;

        public Coin(int y, int x){
            this.x = x;
            this.y = y;
        }
    }

    static class TwoPairCoin{
        int y1;
        int x1;
        int y2;
        int x2;
        int cnt;

        public TwoPairCoin(int y1, int x1, int y2, int x2, int cnt) {
            this.y1 = y1;
            this.x1 = x1;
            this.y2 = y2;
            this.x2 = x2;
            this.cnt = cnt;
        }
    }

    static void bfs(Coin first, Coin second){
        Queue<TwoPairCoin> queue = new LinkedList<>();
        boolean[][][][] visited = new boolean[n][m][n][m];
        queue.offer(new TwoPairCoin(first.y, first.x, second.y, second.x, 1));
        visited[first.y][first.x][second.y][second.x] = true;

        while (!queue.isEmpty()){
            TwoPairCoin temp = queue.poll();
            int x1 = temp.x1;
            int y1 = temp.y1;
            int x2 = temp.x2;
            int y2 = temp.y2;
            int cnt = temp.cnt;

            if(cnt > 10 ) return;

            for( int i = 0; i<4; i++){
                int nx1 = x1 + dx[i];
                int ny1 = y1 + dy[i];
                int nx2 = x2 + dx[i];
                int ny2 = y2 + dy[i];

                if( nx1 >= 0 && nx1 < m && ny1 >= 0 && ny1 < n && board[ny1][nx1] == '#'){
                    nx1 = x1;
                    ny1 = y1;
                }
                if( nx2 >= 0 && nx2 < m && ny2 >= 0 && ny2 < n && board[ny2][nx2] == '#'){
                    nx2 = x2;
                    ny2 = y2;
                }

                int flag = 0;
                if( nx1 < 0 || nx1 >= m || ny1 < 0 || ny1 >= n) flag += 1;
                if( nx2 < 0 || nx2 >= m || ny2 < 0 || ny2 >= n) flag += 1;

                if( flag == 1 ) {
                    result = cnt;
                    return;
                } else if( flag == 2 ){

                } else if(flag == 0) {
                    if( visited[ny1][nx1][ny2][nx2] ) continue;
                    visited[ny1][nx1][ny2][nx2] = true;
                    queue.offer(new TwoPairCoin(ny1, nx1, ny2, nx2, cnt + 1));
                }

            }
        }
    }
}