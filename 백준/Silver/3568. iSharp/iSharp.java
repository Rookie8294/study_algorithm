import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        String str = br.readLine().replace(",", "").replace(";","");

        String[] line = str.split(" ");
        String type = line[0];
        for( int i = 1; i<line.length; i++){
            Stack<Character> stack = new Stack<>();
            String target = line[i];
            StringBuilder val = new StringBuilder();
            for( int j = 0; j<target.length(); j++){
                char c = target.charAt(j);
                if( c >= 65 && c != '[' && c != ']'){
                    val.append(c);
                    continue;
                }
                stack.push(c);
            }

            sb.append(type);
            while (!stack.isEmpty()){
                if( stack.peek() == ']'){
                    stack.pop();
                    sb.append(stack.pop()).append(']');
                    continue;
                }
                sb.append(stack.pop());
            }
            sb.append(" ").append(val);
            sb.append(';').append("\n");
        }


        System.out.println(sb);
        
        
        
        

        br.close();
	}
}