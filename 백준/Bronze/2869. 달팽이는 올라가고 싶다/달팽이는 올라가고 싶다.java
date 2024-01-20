import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);
        int cnt = 1;


        if( (V-A) > (A-B) ){
            if( (V-A)%(A-B) != 0 ){
                cnt += (V-A)/(A-B) + 1;
            } else {
                cnt += (V-A)/(A-B);
            }
        } else {
            cnt ++;
        }
        
        if( V == A){
            cnt = 1;
        }


        System.out.println(cnt);

        

        br.close();
	}
}


