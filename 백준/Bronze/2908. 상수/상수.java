import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int intA = 0;
        int intB = 0;
        int m = 1;
        for( int i = 0; i<3; i++){
            intA += (arr[0].charAt(i) - 48) * m; 
            intB += (arr[1].charAt(i) - 48) * m; 
            m *= 10;
        }
        
        System.out.print(intA > intB ? intA : intB);
        
        br.close();

	}
    
}