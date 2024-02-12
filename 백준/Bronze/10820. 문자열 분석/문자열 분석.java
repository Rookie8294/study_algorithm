import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        String line;
        while ((line = br.readLine()) != null){
            int upper = 0;
            int lower = 0;
            int whitePlace = 0;
            int num = 0;
            for( int i = 0; i<line.length(); i++){
                char c = line.charAt(i);
                if( c > 96 ){
                    lower++;
                } else if( c > 64 ){
                    upper++;
                } else if( c > 47 ){
                    num++;
                } else {
                    whitePlace++;
                }
            }
            sb
                    .append(lower).append(" ")
                    .append(upper).append(" ")
                    .append(num).append(" ")
                    .append(whitePlace).append(" ").append("\n");
        }

        System.out.println(sb);

        br.close();
	}
}