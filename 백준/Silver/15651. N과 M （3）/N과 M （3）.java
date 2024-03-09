import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    
    static int n, m;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[m];

        back(0);

        System.out.println(sb);

        br.close();
	}
    public static void back(int depth){
        if( depth == m){
            for( int i = 0; i<m; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for( int i = 1; i<=n; i++){
            result[depth] = i;
            back(depth + 1);
        }
    }
}