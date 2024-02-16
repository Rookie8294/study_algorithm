import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();

        String binary = br.readLine();
        int leng = binary.length();
        
        if( leng%3 != 0){
            int repeatZero = 3- leng%3;
            binary = "0".repeat(repeatZero) + binary;
        }
        for(int i = 0; i<binary.length(); i+=3){
            sb.append(Character.getNumericValue(binary.charAt(i+2))
                    +Character.getNumericValue(binary.charAt(i+1))*2
                    +Character.getNumericValue(binary.charAt(i))*4);
        }
        System.out.println(sb);
	}
}
