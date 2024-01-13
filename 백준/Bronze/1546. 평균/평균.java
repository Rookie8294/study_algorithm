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

        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[cnt];
        int max = 0;
        int score = -9999;
        for( int i = 0; i<cnt; i++){
            score = Integer.parseInt(st.nextToken());
            if( max < score ){
                max = score;
            }
            arr[i] = score;
        }
        double sum = 0;
        for( int i = 0; i<cnt; i++){
            sum += ((double)arr[i]/max)*100;
           
        }

        System.out.print(sum/cnt);

        br.close();
	}
}