import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        int cnt = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int num = 0;  
        int count = 0;
        for( int i = 0; i<arr.length; i++){
            num = Integer.parseInt(arr[i]);
            if(num == target){
                count++;
           }
        }
        
        System.out.print(count);
        br.close();
	}
}