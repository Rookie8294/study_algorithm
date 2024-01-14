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
        
        int cnt = Integer.parseInt(br.readLine());
        String[] target;
        for( int i = 0; i<cnt; i++){
            target = br.readLine().split("");
            sb.append(target[0]).append(target[target.length-1]);
            if( i != (cnt - 1)){
                sb.append("\n");
            }
        }
        
        System.out.print(sb);

        br.close();
	}
}