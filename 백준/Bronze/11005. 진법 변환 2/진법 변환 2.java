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
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.print(base(N, B));
        
        br.close();
	}
    
    public static String base(int num, int b){
        StringBuilder sb = new StringBuilder();
        while (num >= b){
            int target = num%b;
            if( target < 10 ){
                sb.append(target);
            } else {
                sb.append((char) (target + 55));
            }
            num /= b;
        }

        if( num < 10 ){
            sb.append(num);
        } else {
            sb.append((char) (num+55));
        }
        return sb.reverse().toString();
    }
}