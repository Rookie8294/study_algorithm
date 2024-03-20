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
        
        String line = br.readLine();
        Stack<Character> stack = new Stack<>();
        
        int value = 1;
        int result = 0;
        for( int i = 0; i<line.length(); i++){
            
            if( line.charAt(i) == '('){
                stack.push(line.charAt(i));
                value *= 2;
                continue;
            }
            if( line.charAt(i) == '['){
                stack.push(line.charAt(i));
                value *= 3;
                continue;
            }
            
            if( line.charAt(i) == ')'){
                if( stack.isEmpty() || stack.peek() != '('){
                    result = 0;
                    break;
                }
                if( line.charAt(i-1) == '('){
                    result += value;
                }
                
                value /= 2;
                stack.pop();
                continue;
            }
            
            if( line.charAt(i) == ']'){
                if( stack.isEmpty() || stack.peek() != '['){
                    result = 0;
                    break;
                }
                if( line.charAt(i-1) == '['){
                    result += value;
                }
                
                value /= 3;
                stack.pop();
            }
        }
        
        if( !stack.isEmpty()){
            System.out.print(0);
        } else {
            System.out.print(result);
        }
        
        

        br.close();
	}
}