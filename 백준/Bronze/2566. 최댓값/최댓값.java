import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        int max = -1;
        int x = 0;
        int y = 0;
        for( int i = 1; i<10; i++){
            for( int j = 1; j<10; j++){
                num = readInt();
                if( num > max){
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        sb.append(max).append("\n").append(x).append(" ").append(y);
        System.out.print(sb);
        
        br.close();
	}
    
    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}