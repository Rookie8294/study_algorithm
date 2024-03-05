import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        int[] dwarfs = new int[9];
        int sum = 0;
        for( int i = 0; i<9; i++){
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        for( int i = 0; i<8; i++){
            for( int j = i+1; j<9; j++){
                if( sum - dwarfs[i] - dwarfs[j] == 100){
                    dwarfs[i] = 0;
                    dwarfs[j] = 0;
                    Arrays.sort(dwarfs);
                    for( int k = 2; k<9; k++){
                        sb.append(dwarfs[k]).append("\n");
                    }
                    System.out.print(sb);
                    return;
                }
            }
        }
	}
}