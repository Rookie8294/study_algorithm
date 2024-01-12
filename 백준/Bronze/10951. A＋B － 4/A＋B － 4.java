import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        int a = 0;
        int b = 0;
           
        while( (line = br.readLine()) != null ){
            a = line.charAt(0) - 48;
            b = line.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        
        System.out.print(sb);
        br.close();
	}
}