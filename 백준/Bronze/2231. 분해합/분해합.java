import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int target = Integer.parseInt(br.readLine());
        String temp = "";
        int num = 999999;
        int sum = 0;
        int result = 0;
        for( int i = 0; i<target; i++){
            sum = 0;
            temp = Integer.toString(target-i);
            for( int j = 0; j<temp.length(); j++){
                sum += Character.getNumericValue(temp.charAt(j));

            }
            if( target - i + sum == target && (target - i - sum) < num ){
                num = target - i - sum;
                result = target -i;
            }

        }

        System.out.println(result);

        br.close();
	}
}