import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int target = Integer.parseInt(br.readLine());

        for( int i = 2; i<target+1; i++){
            if( target % i == 0){
                target = target/i;
                sb.append(i).append("\n");
                i--;
            }

        }

        System.out.println(sb);
        

        br.close();
	}
}


