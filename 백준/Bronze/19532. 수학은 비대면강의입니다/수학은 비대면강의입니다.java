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
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int sum1 = 0;
        int sum2 = 0;
        int x = 0;
        int y = 0;
        for( int i = -999; i<1000; i++){
            for( int j = -999; j<1000; j++){
                sum1 = (a*i) + (b*j);
                sum2 = (d*i) + (e*j);
                if( sum1 == c && sum2 == f){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        System.out.print(x + " " + y);

        br.close();
	}
}