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

        Arrays.sort(arr);
        int avg = sum/5;

        System.out.println(avg);
        System.out.println(arr[2]);

        br.close();
	}
}