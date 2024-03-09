import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static int n, cnt;
    static int[] board;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        board = new int[n];
        
        dfs(0);
        System.out.println(cnt);
	}
    static void dfs( int depth ){
        if( depth == n ){
            cnt++;
            return;
        }

        for( int i = 0; i<n; i++){
            board[depth] = i;
            if( isOk(depth) ){
                dfs( depth + 1);
            }
        }
    }

    static boolean isOk(int depth){
        for( int i = 0; i<depth; i++){
            if( board[i] == board[depth]){
                return false;
            } else if (Math.abs(depth - i) == Math.abs(board[depth] - board[i])) {
                return false;
            }
        }
        return true;
    }
}