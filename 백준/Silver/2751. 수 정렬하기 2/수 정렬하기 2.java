import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        boolean[] countArr = new boolean[2000001];
        int[] arr = new int[N];

        for( int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for( int i = 0; i<N; i++){
            countArr[arr[i] + 1000000] = true;
        }

        for( int i = 0; i<countArr.length; i++){
            if( countArr[i] ){
                sb.append(i - 1000000).append("\n");
            }
        }

        System.out.println(sb);
        
        br.close();
	}
}