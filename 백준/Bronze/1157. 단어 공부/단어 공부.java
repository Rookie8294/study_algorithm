import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String input = br.readLine().toUpperCase();
        int[] alphabet = new int[90-64];
        int idx = 0;
        for( int i = 0; i<input.length(); i++){
            idx = input.charAt(i);
            alphabet[idx-65]++;
        }

        int max = 0;
        char result = 'A';
        for( int i = 0; i<alphabet.length; i++){
            if( alphabet[i] > max){
                max = alphabet[i];
                result = (char) ('A' + i);
            } else if( alphabet[i] == max){
                result = '?';
            }
        }

        System.out.println(result);
        br.close();
	}
}