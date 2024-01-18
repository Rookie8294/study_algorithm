import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        String[] arr = br.readLine().split(" ");
        String input = arr[0];
        int decimalSys = Integer.parseInt(arr[1]);
        int temp = Integer.parseInt(arr[1]);
        int target;
        int result = 0;

        for( int i = 0; i<input.length(); i++){
            target = input.codePointAt(i);
            temp = decimalSys;

            if( target > 64 ){
                target = target - 55;
            } else {
                target = target - 48;
            }

            for( int j = i+1; j<input.length()-1; j++){
                temp = temp * decimalSys;
                
            }

            if( i == input.length()-1){
                temp = 1;
            }
            result += target * temp;

            

        }
        System.out.println(result );

        br.close();
	}

}