import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] targetArr = br.readLine().split(" ");
        int leng = Integer.parseInt(targetArr[0]);
        int target = Integer.parseInt(targetArr[1]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        for( int i = 0; i<leng; i++){
            num = Integer.parseInt(st.nextToken());
            if( num < target ){
                sb.append(num).append(" ");
            }
        }
        
        System.out.print(sb);

        br.close();
	}
}