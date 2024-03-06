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
        
        int n = Integer.parseInt(br.readLine());

        boolean[] check = new boolean[1000];
        for( int i = 123; i<=987; i++){
            String num = String.valueOf(i);
            if( num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2) ||
                num.charAt(1) == '0' || num.charAt(2) == '0' ) continue;

            check[i] = true;
        }

        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String game = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for( int j = 123; j<=987; j++){
                if( check[j] ){
                    int s = 0;
                    int b = 0;

                    for( int k = 0; k<3; k++){
                        char number = game.charAt(k);
                        for( int l = 0; l<3; l++ ){
                            char compareNumber = String.valueOf(j).charAt(l);

                            if( number == compareNumber && k == l ) s++;
                            if( number == compareNumber && k != l ) b++;
                        }
                    }

                    if( strike == s && ball == b){
                        check[j] = true;
                    } else {
                        check[j] = false;
                    }
                }
            }

        }

        int result = 0;
        for( boolean chk : check){
            if( chk ) result++;
        }

        System.out.println(result);
        

        br.close();
	}
}