import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            Integer count = map.get(num);
            if( count == null ){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<N; i++){

            while (!stack.isEmpty() && map.get(arr[stack.peek()]) < map.get(arr[i])){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }

        for( int i = 0; i<N; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
        br.close();
        
	}
}