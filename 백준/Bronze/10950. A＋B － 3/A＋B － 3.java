import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        int a = 0;
        int b = 0;
        String[] arr = new String[2];
        
        for( int i = 0; i<count; i++){
            arr = br.readLine().split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            
            System.out.println(a+b);
            
        }
        
    }
}