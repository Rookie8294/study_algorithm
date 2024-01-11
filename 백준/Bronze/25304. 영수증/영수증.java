import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for( int i = 0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());     
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
                
        if( sum == total ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        

	}
    
  
}