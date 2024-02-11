import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        Stack<Double> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        Double[] arr = new Double[N];
        String line = br.readLine();

        for( int i = 0; i<N; i++){
            arr[i] = Double.parseDouble(br.readLine());
        }

        for( int i = 0; i<line.length(); i++){
            char target = line.charAt(i);
            if( target < 48){
                Double next = stack.pop();
                Double prev = stack.pop();
                switch (target){
                    case '*' :
                        stack.push(prev * next);
                        break;
                    case '+' :
                        stack.push(prev + next);
                        break;
                    case '-' :
                        stack.push(prev - next);
                        break;
                    case '/' :
                        stack.push(prev / next);
                        break;
                }
            } else {
                stack.push(arr[target - 65]);
            }

        }

        String format = String.format("%.2f", stack.pop());
        System.out.println(format);

        br.close();
	}
}