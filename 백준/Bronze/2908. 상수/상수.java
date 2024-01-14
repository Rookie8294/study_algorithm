import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        String a = st.nextToken();
        String b = st.nextToken();
        String str1 = "";
        String str2 = "";

        for( int i = 2; i>=0; i--){
            str1 += a.charAt(i);
            str2 += b.charAt(i);
        }
        int result = 0;
        int IntA = Integer.parseInt(str1);
        int IntB = Integer.parseInt(str2);
        if(  IntA> IntB){
            result = IntA;
        } else {
            result = IntB;
        }

        System.out.print(result);
        br.close();

	}
    
}