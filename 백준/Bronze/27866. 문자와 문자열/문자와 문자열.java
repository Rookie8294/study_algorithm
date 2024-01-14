import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;

        String[] str = br.readLine().split("");
        int n = Integer.parseInt(br.readLine());
        for( int i = 0; i<str.length; i++){
            if( i == (n-1) ){
                System.out.println(str[i]);
            } 
        }

        br.close();
	}
}