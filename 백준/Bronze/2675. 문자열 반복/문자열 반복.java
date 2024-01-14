import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        int repeatCnt = 0;
        String[] strArr = null;
        for( int i = 0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            repeatCnt = Integer.parseInt(st.nextToken());
            strArr = st.nextToken().split("");
            for( int j = 0; j<strArr.length; j++){
                sb.append(strArr[j].repeat(repeatCnt));
            }
            if( i != cnt -1 ){
                sb.append("\n");
            }
        }

        System.out.print(sb);
        br.close();
	}
}