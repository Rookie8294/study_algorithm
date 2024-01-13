import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        List<Integer> list = new ArrayList<Integer>();
        for( int i = 1; i<31; i++){
            list.add(i);
        }
        
        int line = 0;
        for( int i = 0; i<28; i++){
            line = Integer.parseInt(br.readLine());
            for( int j = 0; j<list.size(); j++){
                if( line == list.get(j)){
                    list.remove(j);
                }
            }
        }
        
        for( int i = 0 ; i<list.size(); i++){
            sb.append(list.get(i));
            if( i != list.size()-1){
                sb.append(" ");
            }
        }
        
        System.out.print(sb);        
        br.close();
	}
}