import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt  = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        for( int i = 0; i<cnt; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for( int i = 0; i<cnt; i++){
            System.out.println(arr[i]);
        }
        
    }
}