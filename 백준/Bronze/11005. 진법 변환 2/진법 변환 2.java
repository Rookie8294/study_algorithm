import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int input = Integer.parseInt(line[0]);
        int decimalSys =  Integer.parseInt(line[1]);
        String result = "";
        boolean flag = true;
        int target = 0;
        while( flag ){
            target = input%decimalSys;
            if( input / decimalSys == 0 ){
                flag = false;
            } else {
                input = input / decimalSys;
            }

            if( target > 9 ){

                result += Character.toString( target + 55);
            } else {
                result += String.valueOf(target);
            }
        }

        for( int i = 1; i<result.length()+1; i++){
            sb.append(result.charAt(result.length()-i));
        }

        System.out.println(sb);
        

        br.close();
	}


}