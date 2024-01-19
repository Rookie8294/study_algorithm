import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int point = (int)Math.pow(2, num) + 1;
        System.out.print(point*point);
        

        br.close();
	}
}

