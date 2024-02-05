import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int startNum = 1;
        
        for(int i = 0 ; i<N; i++){
            int target = Integer.parseInt(br.readLine());
            for( int j = startNum; j<N+2; j++){
				if( !stack.isEmpty() && target == stack.peek() ) {
					stack.pop();
					sb.append("-").append("\n");
					startNum = j;
					break;
				}
				stack.push(j);
				sb.append("+").append("\n");
            }//end for
        }//end for
        
        if( stack.isEmpty() ){
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
        
    }
}