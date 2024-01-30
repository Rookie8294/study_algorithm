import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] target = br.readLine().split("");
        int[] arr = new int[target.length];

        for(int i = 0; i<target.length; i++){
            arr[i] = Integer.parseInt(target[i]);
        }

        for( int i = 0; i<arr.length-1; i++){
            for( int j = i+1; j<arr.length; j++){
                int temp = 0;
                if( arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        System.out.print(sb);

        br.close();
	}
}
