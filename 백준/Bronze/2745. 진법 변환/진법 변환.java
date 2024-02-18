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
        
        st = new StringTokenizer(br.readLine());
        String target = st.nextToken();
        int decimalSystem = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i = 0; i<target.length();i++){
            char c = target.charAt(i);
            int temp = 1;
            int a = 0;
            if( c <= '9'){
                a = c - 48;
            } else {
                a = c- 55;
            }

            for( int j = i; j<target.length()-1; j++){
                temp *= decimalSystem;
            }
            result += temp * a;
        }

        System.out.println(result);
        

        br.close();
	}
}