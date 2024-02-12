import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if( c > 96 ){
               int target = c + 13;
               if( target > 122 ){
                   int result = target - 122 + 96;
                   sb.append((char) result);
               } else {
                   sb.append((char) target);
               }

            }else if( c > 64 ){
                int target = c + 13;
                if( target > 90 ){
                    int result = target - 90 + 64;
                    sb.append((char) result);
                } else {
                    sb.append((char) target);
                }
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
        br.close();
	}
    
}