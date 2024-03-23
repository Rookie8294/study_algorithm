import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int target = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;

        while( target != 0 ){
            int temp = 0;
            if( target / 500 > 0 ){
                temp = target/500;
                target -= temp * 500;
                cnt += temp;
                continue;
            }
            if( target / 100 > 0 ){
                temp = target/100;
                target -= temp * 100;
                cnt += temp;
                continue;
            }
            if( target / 50 > 0 ){
                temp = target/50;
                target -= temp * 50;
                cnt += temp;
                continue;
            }
            if( target / 10 > 0 ){
                temp = target/10;
                target -= temp * 10;
                cnt += temp;
                continue;
            }
            if( target / 5 > 0 ){
                temp = target/5;
                target -= temp * 5;
                cnt += temp;
                continue;
            }

            temp = target;
            target -= target;
            cnt += temp;
        }

        System.out.print(cnt);
	}
}