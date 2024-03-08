import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[3];
        for( int i = 0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] startYear = {1, 1, 1};
        int year = 1;
        boolean flag = true;

        while(true){
            int e = startYear[0];
            int s = startYear[1];
            int m = startYear[2];

            if (e == arr[0] && s == arr[1] && m == arr[2]) {
                break;
            }
            startYear[0] = startYear[0] + 1;
            startYear[1] = startYear[1] +1;
            startYear[2] = startYear[2] +1;
            year++;

            if( startYear[0] > 15 ){
                startYear[0] = 1;
            }
            if ( startYear[1] > 28 ){
                startYear[1] = 1;
            }
            if ( startYear[2] > 19){
                startYear[2] = 1;
            }

        }

        System.out.println(year);
        

        br.close();
	}
}