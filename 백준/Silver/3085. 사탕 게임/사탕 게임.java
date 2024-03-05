import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    
    static int n;
    static char[][] candy;
    static int max = 0;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        candy = new char[n][n];

        for( int i = 0; i<n; i++){
            String line = br.readLine();
            for( int j = 0; j<n; j++){
                candy[i][j] = line.charAt(j);
            }
        }

        // 가로
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n-1; j++){
                char temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;

                candyCount();

                temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;
            }
        }

        // 세로
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n-1; j++){
                char temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;

                candyCount();

                temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;
            }
        }

        System.out.print(max);

        br.close();
	}
    
    static void candyCount(){
        // 가로 체크
        for( int i = 0; i<n; i++){
            int count = 1;
            for( int j = 0; j<n-1; j++){
                if( candy[i][j] == candy[i][j+1]){
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        // 세로 체크
        for( int i = 0; i<n; i++){
            int count = 1;
            for( int j = 0; j<n-1; j++){
                if( candy[j][i] == candy[j+1][i]){
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

    }
}