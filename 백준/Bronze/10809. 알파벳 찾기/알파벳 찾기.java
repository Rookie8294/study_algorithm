import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int target = 0;

        for( int i = 0; i<input.length(); i++ ){
            target = input.codePointAt(i) - 97;
            if( arr[target] == -1 ){
                arr[target] = i;
            }
        }


        for( int i = 0; i<arr.length; i++ ){
            sb.append(arr[i]);
            if( i != arr.length -1){
                sb.append(" ");
            }
        }

        System.out.print(sb);
        br.close();
	}
}