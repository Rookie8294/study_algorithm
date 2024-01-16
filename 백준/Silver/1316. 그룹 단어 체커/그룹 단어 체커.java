import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        Set<Character> set = new HashSet<Character>();

        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        int minus = 0;
        String input = "";
        List<Character> list = new ArrayList<Character>();
        for( int i = 0; i<cnt; i++){
            input = br.readLine();

            for( int j = 0; j<input.length(); j++){
                if( j == input.length()-1){
                    list.add(input.charAt(j));
                    break;
                }
                if( (j+1) < input.length() && input.charAt(j) == input.charAt(j+1)){
                    continue;
                } else {
                    list.add(input.charAt(j));
                }
            }

            for (int k = 0; k< list.size(); k++) {
                if (!set.add(list.get(k))) {
                    minus++;
                    break;
                }
            }
            list.clear();
            set.clear();
        }

        System.out.print(cnt - minus);
        

        br.close();
	}
}