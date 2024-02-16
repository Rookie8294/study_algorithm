import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();

        String binary = br.readLine();
        int[] octalArr = {4,2,1};

        int leng = binary.length();
        if( leng%3 != 0){
            int repeatZero = 3- leng%3;
            binary = "0".repeat(repeatZero) + binary;
        }
        for(int i = 0; i<binary.length(); i+=3){
            String octal = binary.substring(i, Math.min(i+3, binary.length()));
            int result = 0;
            for( int j = 0; j<3; j++){
                int idx = Character.getNumericValue(octal.charAt(j));
                result += octalArr[j]*idx;
            }

            sb.append(result);
        }

        System.out.println(sb);
	}
}
