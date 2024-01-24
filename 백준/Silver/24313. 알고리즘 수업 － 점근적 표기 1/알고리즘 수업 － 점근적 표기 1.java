import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        String[] arr = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a2 = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        if( (a1*n)+a2 <= c*n && c >= a1 ){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        br.close();
	}
}