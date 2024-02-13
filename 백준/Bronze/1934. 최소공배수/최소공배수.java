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
        
        int N = Integer.parseInt(br.readLine());
        
        for( int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b  = Integer.parseInt(st.nextToken());
            int c = gcd(a,b);
            sb.append(lcm(a,b,c)).append("\n");
        }

        System.out.print(sb);
        br.close();
	}
    
    private static int gcd(int a, int b){
        while( b != 0 ){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    
    private static int lcm(int a, int b, int c){
        return a*b/c;
    }
}