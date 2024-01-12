import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String line;
        List<String> list = new ArrayList<String>();
        while( (line = br.readLine()) != null ){
            list.add(line);
        }
        
        String[] arr;
        int sum = 0;
        for( int i = 0; i<list.size(); i++){
            arr = list.get(i).split(" ");
            sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            if( sum != 0 ){
                sb.append(sum).append("\n");
            } else {
                break;
            }
        }
        System.out.print(sb);

        br.close();
	}
}