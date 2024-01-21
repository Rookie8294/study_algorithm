import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int flag = 0;
        int result = 0;
        int target = 0;
        for( int i = 0; i<arr.length; i++){
            target = Integer.parseInt(arr[i]);

            for( int j = 1; j<target+1; j++ ){
                if( target % j == 0 ){

                    flag++;

                }
            }
            if( flag == 2 ){
                result++;
            }
            flag = 0;
        }
        System.out.println(result);
        

        br.close();
	}
}


