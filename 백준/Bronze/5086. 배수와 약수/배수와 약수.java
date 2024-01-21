import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        int a = 0;
        int b = 0;
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if( a == 0 ){
                break;
            }

            if( b%a == 0){
                System.out.println("factor");
            } else if(a%b == 0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        

        br.close();
	}
}


