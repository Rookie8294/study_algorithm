import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for( int i = 1; i<cnt+1; i++){
            sb.append(" ".repeat(cnt - i));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.println(sb);
        
        br.close();
	}
    
    
}