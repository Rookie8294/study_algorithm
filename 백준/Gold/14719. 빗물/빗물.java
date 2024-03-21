import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] height = new int[w];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<w; i++){
            height[i] = Integer.parseInt(st.nextToken());
        }
        
        for( int i = 1; i<w-1; i++){
            int right = 0;
            int left = 0;
            for( int j = 0; j<i; j++){
                left = Math.max(left, height[j]);
            }
            for( int k = i; k<w; k++){
                right = Math.max(right, height[k]); 
            }
            
            if( height[i] < left && height[i] < right ){
                result += Math.min(left, right) - height[i];
            }
        }
        
        
        System.out.print(result);
        

        br.close();
	}
}
