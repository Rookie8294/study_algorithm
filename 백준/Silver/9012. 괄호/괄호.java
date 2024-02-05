import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<N; i++){
            String line = br.readLine();
            sb.append(solve(line)).append("\n");
        }
           
        System.out.print(sb);
        
    }//main
    
    public static String solve(String ps){
        Stack<Character> stack = new Stack<>();
        
        for(int j = 0; j<ps.length(); j++){
            char c = ps.charAt(j);
            if( c == '('){
                stack.push('(');
            } else if( stack.empty() ){
                return "NO";
            } else{
                stack.pop();
            }
        }//end for
        
        if( stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }//solve
}//class