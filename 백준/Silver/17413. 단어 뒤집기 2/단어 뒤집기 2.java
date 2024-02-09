import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        String target = br.readLine();
        int N = target.length();
        boolean flag = false;
        for(int i = 0; i<N; i++){
            char c = target.charAt(i);
            if( c == '<'){
                while( !stack.isEmpty() ){
                    sb.append(stack.pop());
                }
                flag = true;
            } else if( c == '>'){
                sb.append(c);
                flag = false;
                continue;
            }

            if( !flag && c == ' '){
                while( !stack.isEmpty() ){
                    sb.append(stack.pop());
                }
                sb.append(" ");
                continue;
            }

            if( flag ){
                sb.append(c);
            } else {
                stack.push(c);
            }

            if( i == N-1){
                while( !stack.isEmpty() ){
                    sb.append(stack.pop());
                }
            }

        }

        br.close();
        System.out.println(sb);
	}
}
