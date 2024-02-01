import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i<N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a, b)-> {
            if( a.length() == b.length() ){
                for(int i = 0; i<a.length(); i++){
                    if(a.charAt(i) != b.charAt(i)){
                        return a.charAt(i) - b.charAt(i);
                    }
                }
            }
            return a.length() - b.length();

            }
        );

        for (int i = 0; i < N; i++) {
            if( i == N-1){
                sb.append(arr[i]).append("\n");
                break;

            }
            if( arr[i].equals(arr[i+1])){
                continue;
            }
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
        

        br.close();
	}
}