import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int[][] arr = new int[3][2];

        for(int i = 0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arr[i].length; i++) {
            if( arr[0][i] == arr[1][i]){
                sb.append(arr[2][i]).append(" ");
                continue;
            }
            if( arr[0][i] == arr[2][i]) {
                sb.append(arr[1][i]).append(" ");
                continue;
            }
            if( arr[1][i] == arr[2][i]){
                sb.append(arr[0][i]).append(" ");
                continue;
            }

        }
        System.out.println(sb);
        

        br.close();
	}
}
