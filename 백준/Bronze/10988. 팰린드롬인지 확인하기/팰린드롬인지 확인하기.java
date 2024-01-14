import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
       int reverseIdx = input.length-1;
       int idx = 0;
       int cnt = 0;

        for(int i = 0; i<input.length; i++){
            if(input[idx++].equals(input[reverseIdx--]) ) {
                cnt++;
            }
        }

        if( cnt == input.length){
            System.out.print(1);
        } else {
            System.out.print(0);

        }
        br.close();
	}
}