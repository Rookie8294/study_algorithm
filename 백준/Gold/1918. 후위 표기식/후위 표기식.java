import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();

        String line = br.readLine();

        for(int i = 0; i<line.length(); i++){
            char now = line.charAt(i);

            switch (now){
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                        sb.append(stack.pop());
                    }
                    stack.push(now);
                    break;
                case '(':
                    stack.push(now);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(now);
            }

        }

        while( !stack.isEmpty() ){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        

        br.close();
	}
    
    private static int priority(char c){
        if( c == '(' || c== ')' ){
            return 0;
        } else if( c == '*' || c == '/'){
            return 2;
        } else if( c== '+' || c == '-'){
            return 1;
        } else {
            return -1;
        }
    }
}