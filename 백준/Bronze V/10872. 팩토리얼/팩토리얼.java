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
        
        int N  = Integer.parseInt(br.readLine());
        int sum = 1;
        for(int i = 1; i<=N; i++){
            sum *= i;
        }
        
        System.out.print(sum);
        br.close();
	}
}