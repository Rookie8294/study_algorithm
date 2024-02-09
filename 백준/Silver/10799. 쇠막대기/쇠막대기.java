import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String line = br.readLine();
        int iron = 0;
        int cnt = 0;
        for(int i = 0; i<line.length(); i++){
            char c = line.charAt(i);
            if( c == '('){
                if( line.charAt(i+1) == ')'){
                    cnt += iron;
                    i++;
                }else {
                    iron++;
                }
            } else {
                cnt++;
                iron--;
            }
        }

        System.out.println(cnt);
        

        br.close();
	}
}
