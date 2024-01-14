import java.lang.StringBuilder;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int line = 2*N-1;
        int space = line-N;
        int star = 1;
        for(int k = 0; k<line; k++) {
            for (int i = 0; i <space; i++) {
                sb.append(" ");
            }
            for( int j = 0; j<star; j++){
                sb.append("*");
            }
            if( k > N-2){
                space++;
                star = star - 2;
            } else {
                space--;
                star = star + 2;
            }
            if( k < line-1){
                sb.append("\n");
            }
        }

        System.out.print(sb);
	}
}