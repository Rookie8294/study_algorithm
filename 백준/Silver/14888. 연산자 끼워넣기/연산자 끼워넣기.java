import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int n, max, min;
    static int[] operator, nums;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        operator = new int[4];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(nums[0], 1);
        
        sb.append(max).append("\n").append(min);
        System.out.println(sb);
        

        br.close();
	}
    
    static void dfs(int num, int idx){
        
        if( idx == n ){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
          
        
        for( int i = 0; i<4; i++){
            
            if( operator[i] > 0 ){
                
                operator[i]--;
                
                switch(i){
                    case 0 : dfs(num + nums[idx], idx+1); break;
                    case 1 : dfs(num - nums[idx], idx+1); break;
                    case 2 : dfs(num * nums[idx], idx+1); break;
                    case 3 : dfs(num / nums[idx], idx+1); break;
                }
                
                operator[i]++;
            }
        }
    }
}