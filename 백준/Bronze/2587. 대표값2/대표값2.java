import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int sum = 0;
        int target = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            target = Integer.parseInt(br.readLine());
            sum += target;
            arr[i] = target;
        }

        //Arrays.sort(arr);

        for( int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                int temp = 0;
                if( arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int avg = sum/5;

        System.out.println(avg);
        System.out.println(arr[2]);

        br.close();
	}
}