import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int[] basket;
    static int temp;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int move1 = 0;
        int move2 = 0;
        int temp = 0;
        basket = new int[N+1];
        for( int i = 1; i<basket.length; i++){
            basket[i] = i;
        }
        for( int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            move1 = Integer.parseInt(st.nextToken());
            move2 = Integer.parseInt(st.nextToken());
            
            swap(move1, move2);
        }
        for( int i = 1; i<basket.length; i++){
            sb.append(basket[i]);
            if( i != basket.length-1){
                sb.append(" ");
            }
        }
        System.out.print(sb);
        br.close();
	}
    public static void swap(int a, int b){
        temp = basket[a];
        basket[a] = basket[b];
        basket[b] = temp;
    }
}