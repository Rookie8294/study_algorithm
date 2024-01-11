import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for( int i = 1; i<10; i++){
            sb.append(num).append(" * ").append(i).append(" = ").append(num*i);
            System.out.println(sb);
            sb.setLength(0);
        }
        
        
    }
}