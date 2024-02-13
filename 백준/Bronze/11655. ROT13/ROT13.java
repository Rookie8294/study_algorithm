import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = br.readLine();
        int N = line.length();

        for(int i = 0; i<N; i++){
            char c = line.charAt(i);
            if( !Character.isLetter(c)){
                sb.append(c);
            } else{
                int target = c + 13;
                if( Character.isUpperCase(c) && target > 'Z' ){
                    target -= 26;
                }
                if( Character.isLowerCase(c) && target > 'z'){
                    target -= 26;
                }

                sb.append((char) target);
            }
        }

        System.out.println(sb);
	}
    
}