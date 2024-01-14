import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        int leng = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");
        int sum = 0;
        for( int i = 0; i<leng; i++){
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.print(sum);
        br.close();
	}
}