import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int work = 0;
        int fatigue = 0;

        for( int i = 0; i<24; i++){
//            if( fatigue > m ){
//                work = 0;
//                break;
//            }

            int temp = fatigue + a;
            if( temp > m ){
                fatigue -= c;
                if( fatigue < 0 ){
                    fatigue = 0;
                }
                continue;
            }
            //일한다
            fatigue += a;
            work += b;
        }

        System.out.println(work);

        br.close();
	}
}