import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int cnt = Integer.parseInt(input[1]);
        int n = 0;
        int result = 0;
         for( int i = 1; i<num+1; i++){
            if( num % i == 0 ){
                result = i;
                n++;
            }
            if( n == cnt ){
                break;
            } else {
                result = 0;
            }
        }
        
        System.out.println(result);
        
        br.close();
	}
}


