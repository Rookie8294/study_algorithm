import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String line;
        while( !(line = br.readLine()).equals("0") ){
            int num = Integer.parseInt(line);
            System.out.println(primeCnt(num));
        }
        
        
        
        
	
    }
    public static int primeCnt(int n) {
        int m = n * 2;
        int cnt = 0;
        boolean[] prime = new boolean[m + 1];

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(m); i++) {
            if(prime[i]) continue;
            for( int j = i * i; j<=m; j += i){
                prime[j] = true;
            }

        }
        for( int i = n+1; i<=m; i++ ){
            if(!prime[i]) cnt++;
        }


        return cnt;

    }

}