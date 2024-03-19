import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int total = start + end;
        int sum = 0;
        int cnt = 0;
        int[] result = new int[total];
        for( int i = 1; i<=total; i++){
            for( int j = 0; j<i; j++){
                result[cnt] = i;
                if( cnt == end){
                    break;
                }
                cnt++;
            }
        }

        for( int i = start-1; i<end; i++){
            sum += result[i];
        }
        System.out.println(sum);
        

        br.close();
	}
}