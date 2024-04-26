import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = 0;
        int[] tree = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<n; i++){
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }
        
        while(min < max){
            int mid = (max + min) / 2;
            long sum = 0;
            
            for( int height : tree){
                if( height - mid > 0 ){
                    sum += height - mid;
                }
            }
            
            if( sum < m ) max = mid;
            else min = mid + 1;
        
        }
        
        System.out.print(min - 1);       
        
	
    }

}