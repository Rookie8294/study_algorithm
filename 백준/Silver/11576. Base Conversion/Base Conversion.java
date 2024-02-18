import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int result = 0;
        int sum = 0;
        for( int i = N-1; i>=0; i--){
            int target = Integer.parseInt(st.nextToken());
            sum += target * Math.pow(A, i);
        }
        Stack stack = new Stack();
        while ( sum != 0 ){
            stack.push(sum % B);
            sum /= B;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
	}
    
}