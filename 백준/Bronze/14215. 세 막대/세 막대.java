import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        Arrays.sort(arr);
        int target = arr[0] + arr[1];
        int max = arr[2];
        if( arr[2] >= target ){
            max = target-1;
        }
        
        System.out.print(target + max);
        
        
        

        br.close();
	}
}