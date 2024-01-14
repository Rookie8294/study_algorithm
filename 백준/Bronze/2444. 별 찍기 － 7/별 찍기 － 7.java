import java.lang.StringBuilder;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for( int i = 1; i<N; i++){
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat(i*2-1));
            sb.append("\n");
        }

        for( int i = 0; i<N; i++){
            sb.append(" ".repeat(i));
            sb.append("*".repeat(N*2-1-(i*2)));
            if( i != N-1){
                sb.append("\n");
            }
        }

        System.out.print(sb);
	}
}