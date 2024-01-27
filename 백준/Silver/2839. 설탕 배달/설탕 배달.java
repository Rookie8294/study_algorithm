import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int target = Integer.parseInt(br.readLine());

        int num = 0;
        int result = 0;
        if( target%5 == 0 ){
            result = target/5;
        } else {
            if( target%5 == 3 ){
                result = target/5 + 1;
            } else {
                for( int i = 0 ; i<target/5; i++){
                    num = target-(i*5);
                    if( num%3 == 0){
                        result = num/3 + i;
                    }
                }
            }
            if( result == 0 ){
                result = -1;
            }
        }

        System.out.println(result);

        br.close();
	}
}