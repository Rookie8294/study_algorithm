import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder[] sb = new StringBuilder[201];

        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i<201; i++){
            sb[i] = new StringBuilder();
        }

        for( int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            sb[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder result = new StringBuilder();
        for( int i = 1; i<sb.length; i++){
            result.append(sb[i]);
        }

        System.out.println(result);
        br.close();
	}
}