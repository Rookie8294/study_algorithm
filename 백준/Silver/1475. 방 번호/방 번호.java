import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        char[] num = br.readLine().toCharArray();
        int[] arr = new int[10];

        for( int i = 0; i<num.length; i++){
            int idx = Character.getNumericValue(num[i]);
            arr[idx]++;
        }
        int sixAndNine = arr[6] + arr[9];
        int target  = (sixAndNine/2) + (sixAndNine%2);
        arr[6] = target;
        arr[9] = target;
        int maxValue = 0;
        for( int i : arr){
            if( i != 0 ){
                maxValue = Math.max(maxValue, i);
            }
        }

        System.out.println(maxValue);

        br.close();
	}
}