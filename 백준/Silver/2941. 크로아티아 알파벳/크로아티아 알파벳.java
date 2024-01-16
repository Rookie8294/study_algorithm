import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String input = br.readLine();
        int cnt = 0;
        for( int i = 0; i<input.length(); i++){
            if( i == input.length() - 1){
                cnt++;
                break;
            }

            if( input.charAt(i) == 'c'){

                if( input.charAt(i+1) == '=' || input.charAt(i+1) == '-'){
                    i++;
                }
                cnt++;

                continue;
            }

             if( input.charAt(i) == 'd'){
                if( input.charAt(i+1) == 'z' && (i + 2) < input.length() ){
                    if( input.charAt(i+2) == '='){
                        i = i+2;
                    }
                } else if( input.charAt(i+1) == '-'){
                    i++;
                }
                cnt++;
                continue;
            }

            if( input.charAt(i) == 'l' || input.charAt(i) == 'n'){
                if( input.charAt(i+1) == 'j' ){
                    i++;
                }
                cnt++;

                continue;
            }

            if( input.charAt(i) == 's' || input.charAt(i) == 'z'){
                if( input.charAt(i+1) == '='){
                    i++;
                }
                cnt++;
                continue;
            }

            cnt++;

        }

        System.out.print(cnt);

        br.close();
	}
}