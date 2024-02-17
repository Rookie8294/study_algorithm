import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        
        if( num == 0 ){
            System.out.print(0);
        }
        while (num != 0 ){
            sb.append(Math.abs(num % -2));
            num = (int)Math.ceil((double) num/-2);
        }

        System.out.print(sb.reverse());

        br.close();
	}
}