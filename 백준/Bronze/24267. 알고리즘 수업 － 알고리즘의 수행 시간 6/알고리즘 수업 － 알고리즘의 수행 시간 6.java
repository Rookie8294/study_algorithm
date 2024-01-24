import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        Long n = Long.parseLong(br.readLine());
        
        System.out.println(n*(n-1)*(n-2)/6);
        System.out.print(3);
        

        br.close();
	}
}