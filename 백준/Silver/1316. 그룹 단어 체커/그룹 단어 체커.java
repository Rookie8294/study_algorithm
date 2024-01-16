import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        String input = "";
        boolean[] visited;

        for( int i = 0; i<cnt; i++){
            input = br.readLine();
            visited = new boolean[30];
            result++;
            visited[input.charAt(0) - 'a'] = true;
            for( int j = 1; j<input.length(); j++){
                if( input.charAt(j) == input.charAt(j-1)){
                    continue;
                }
                if( visited[input.charAt(j) - 'a']){
                    result--;
                    break;
                }

                visited[input.charAt(j) - 'a'] = true;
            }

        }

        System.out.print(result);
        br.close();
	}
}