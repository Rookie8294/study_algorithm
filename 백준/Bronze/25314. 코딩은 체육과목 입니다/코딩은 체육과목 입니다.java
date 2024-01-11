import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int cnt = num/4;
        String str = "long";
        for( int i = 0; i<cnt; i++){
            sb.append(str).append(" ");
        }
        
        sb.append("int");
        System.out.println(sb);

	}
}