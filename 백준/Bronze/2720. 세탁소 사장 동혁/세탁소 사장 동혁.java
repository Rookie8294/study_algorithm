import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};
        int target = 0;
        for( int i = 0; i<cnt; i++){
            target = Integer.parseInt(br.readLine());

            for( int j = 0; j<arr.length; j++){
                sb.append(target / arr[j]).append(" ");
                target = target % arr[j];
            }
            sb.append("\n");

        }

        System.out.println(sb);
        

        br.close();
	}
}

