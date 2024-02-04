import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for( int k = 0; k<N; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while( st.hasMoreTokens() ){
                StringBuilder sb = new StringBuilder(st.nextToken());
                result.append(sb.reverse()).append(" ");
            }
		    result.append("\n");
        }//end for
        
        System.out.print(result);
    }//main
}//class