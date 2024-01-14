import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] nums =  br.readLine().split(" ");
        int[] piece = {1,1,2,2,2,8};
        int target = 0;
        for( int i = 0; i<piece.length; i++){
            target = Integer.parseInt(nums[i]);
            sb.append(piece[i] - target);
            if( i != piece.length - 1){
                sb.append(" ");
            }
        }
        
        System.out.print(sb);
        
        br.close();
	}
}