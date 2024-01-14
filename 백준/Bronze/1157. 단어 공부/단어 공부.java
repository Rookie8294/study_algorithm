import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String input = br.readLine().toUpperCase();
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i<input.length(); i++){
           map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) +1 );
        }

        int max = 0;
        char result = 'a';
        for( int i = 0; i<input.length(); i++){
            if( map.get(input.charAt(i)) > max ){
              max = map.get(input.charAt(i));
              result = input.charAt(i);
            }
        }

        Set<Character> set = new HashSet<Character>();
        for( int i = 0; i<input.length(); i++){
            if( map.get(input.charAt(i)) == max ){
                set.add(input.charAt(i));
            }
        }

        if( set.size() > 1){
            System.out.print("?");
        } else {
            System.out.print(result);
        }

        br.close();
	}
}