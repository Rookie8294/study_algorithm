import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
//Case #1: 1 + 1 = 2
public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for( int i = 1; i<cnt+1; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a).append(" + ")
                .append(b).append(" = ").append(a+b).append("\n");
        }
        System.out.println(sb);
        br.close();
	}
}