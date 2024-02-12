import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        String target = br.readLine();
        String[] arr = new String[target.length()];

        for( int i = 0; i<arr.length; i++){
            arr[i] = target.substring(i, arr.length);
        }

        Arrays.sort(arr);

        for (String str : arr) {
            sb.append(str).append("\n");
        }
        
        System.out.print(sb);
        

        br.close();
	}
}