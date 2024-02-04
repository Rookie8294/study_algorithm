import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    public static int[] stack;
    public static int size = 0;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        for( int i = 0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            switch(arr[0]){
                case "push" :
                    push(Integer.parseInt(arr[1]));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
        
    }//main
    
    public static void push(int num){
        stack[size] = num;
        size++;
    }
    public static int pop(){
        if( size == 0 ){
            return -1;
        } else {
            int result = stack[size-1];
            stack[size-1] = 0;
            size--;
            return result;
        }
    }
    public static int top(){
        if( size == 0 ){
            return -1;
        } else {
            return stack[size-1];
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if( size == 0 ){
            return 1;
        } else {
            return 0;
        }
    }
}//class