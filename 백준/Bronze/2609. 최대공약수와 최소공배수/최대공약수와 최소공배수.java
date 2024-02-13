import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = Math.min(A, B);

        int cnt = 2;
        int divisor = 1;
        while (cnt <= min) {
            int a = A%cnt;
            int b = B%cnt;
            if( a == 0 && b == 0){
                divisor *= cnt;
                A = A/cnt;
                B = B/cnt;
                cnt = 2;
            } else {
                cnt++;
                continue;
            }
        }

        sb.append(divisor).append("\n").append(divisor*A*B);
        System.out.println(sb);


        br.close();
	}
}