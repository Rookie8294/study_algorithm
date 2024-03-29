import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int n, cnt;
    static int[][] wall;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        wall = new int[n+1][n+1];
        for( int i = 1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for( int j = 1; j<=n; j++){
                wall[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        dfs(1, 2, 0);
        System.out.println(cnt);

        br.close();
	}
    
     static void dfs(int y, int x, int status){
        if( y == n && x == n){
            cnt++;
            return;
        }

        switch (status){
            case 0 :
                if( (x+1) <= n && wall[y][x+1] != 1 ) dfs(y, x+1, 0);
                if( (x+1) <= n && (y+1) <= n && wall[y][x+1] !=1 && wall[y+1][x] != 1 && wall[y+1][x+1] != 1) dfs(y + 1, x + 1, 2);
                break;
            case 1 :
                if( (y+1) <= n && wall[y+1][x] !=1 ) dfs(y+1, x, 1);
                if( (x+1) <= n && (y+1) <= n && wall[y][x+1] !=1 && wall[y+1][x] != 1 && wall[y+1][x+1] != 1) dfs(y + 1, x + 1, 2);
                break;
            case 2 :
                if( (x+1) <= n && wall[y][x+1] != 1 ) dfs(y, x+1, 0);
                if( (y+1) <= n && wall[y+1][x] !=1 ) dfs(y+1, x, 1);
                if( (x+1) <= n && (y+1) <= n && wall[y][x+1] !=1 && wall[y+1][x] != 1 && wall[y+1][x+1] != 1) dfs(y + 1, x + 1, 2);
                break;
        }

    }
}