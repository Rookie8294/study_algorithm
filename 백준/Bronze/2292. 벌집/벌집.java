import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        int i = 1;
        int num = 1;
        int result = 1;
        int target = 1;
        if( cnt != 1 ){
            while( target > 0 ){
                num = num + (i * 6);
                target = cnt - num;
                result++;
                i++;
            }
        }

        System.out.println(result);
    }
}