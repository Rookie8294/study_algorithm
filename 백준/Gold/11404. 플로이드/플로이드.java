import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int max = 999999999;
        int[][] city = new int[n + 1][n + 1];
        for (int i = 1; i < city.length; i++) {
            for( int j = 1; j<city[i].length; j++){
                city[i][j] = max;
                if( i == j){
                    city[i][j] = 0;
                }
            }
        }

        for( int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            city[y][x] = Math.min(city[y][x], cost);
        }


        for( int k = 1; k<=n; k++){
            for( int i = 1; i<=n; i++){
                for( int j = 1; j<=n; j++){
                    if( i != j){
                        city[i][j] = Math.min(city[i][j], city[i][k] + city[k][j]);
                    }
                }
            }
        }

        for( int i = 1; i<=n; i++){
            for (int j = 1; j <= n; j++) {
                if (city[i][j] == max) {
                    city[i][j] = 0;
                }
                sb.append(city[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        

        br.close();
	}
}