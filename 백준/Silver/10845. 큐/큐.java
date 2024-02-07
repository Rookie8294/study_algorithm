import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    
    static int[] queue;
    static int idx = 0;
    static int size = 0;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];
        idx = N-1;

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(getSize()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

        br.close();
	}
    
    public static void push(int num){
        queue[idx] = num;
        idx--;
        size++;
    }

    public static int pop(){
        if( size == 0){
            return -1;
        } else {
            int result = queue[idx+size];
            queue[idx+size] = 0;
            size--;
            return result;
        }
    }

    public static int getSize(){
        return size;
    }

    public static int empty(){
        if( size == 0 ){
            return 1;
        } else {
            return 0;
        }
    }

    public static int front(){
        if( size == 0 ){
            return -1;
        } else {
            return queue[idx+size];
        }
    }

    public static int back(){
        if( size == 0 ){
            return -1;
        } else {
            return queue[idx+1];
        }
    }
}