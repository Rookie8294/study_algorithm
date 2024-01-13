import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int max = 0;
        int idx = 0;
        int target = 0;
        
        for( int i = 1; i<10; i++){
            target = Integer.parseInt(br.readLine());
            if( max < target ){
                max = target;
                idx = i;
            }
        }
        
        sb.append(max).append("\n").append(idx);
        System.out.print(sb);
                   

        br.close();
	}
}