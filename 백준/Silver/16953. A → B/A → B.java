import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int b, result;
    static long a;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        result = -1;
        recur(a, 0);
        System.out.println(result);
        
        br.close();
	}
    static void recur(long start, int cnt){
        if( start == b ){
            result = cnt+1;
            return;
        }

        if( (start * 2) <= b ){
            recur(start*2, cnt+1);
        }
        if( (start*10+1) <= b ){
            recur(start*10+1, cnt+1);
        }
    }
}