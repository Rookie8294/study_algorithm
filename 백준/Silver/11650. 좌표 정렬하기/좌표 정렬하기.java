import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());

        int[][] arr = new int[cnt][2];
        for( int i = 0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (e1, e2)->{
            if( e1[0] == e2[0] ){
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for( int i = 0; i<cnt; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);

        br.close();
	}
}