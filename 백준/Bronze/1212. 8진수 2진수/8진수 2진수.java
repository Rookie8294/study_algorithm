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
            
        String line = br.readLine();

        for( int i = 0; i<line.length(); i++){
            int num = Character.getNumericValue(line.charAt(i));
            sb.append(getBinary(num));
        }

        if( sb.toString().contains("1")){
            System.out.print(sb.substring(sb.toString().indexOf("1")));
        }else {
            System.out.print(0);
        }

        
        br.close();
	}
    public static String getBinary(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(((num / 2) / 2) % 2)
                .append((num / 2) % 2)
                .append(num % 2);

        return sb.toString();
    }
}