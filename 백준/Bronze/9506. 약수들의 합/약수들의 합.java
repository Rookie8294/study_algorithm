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
        

        while (true){
            int target = Integer.parseInt(br.readLine());
            if( target == -1 ){
                break;
            }
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for( int i = 1; i<target; i++){
                if( target % i == 0 ){
                    list.add(i);
                    sum += i;
                }
            }

            sb.append(target);
            if( target == sum ){
                sb.append(" = ");
                for (int j = 0; j < list.size()-1; j++) {
                    sb.append(list.get(j)).append(" + ");
                }
                sb.append(list.get(list.size()-1));
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
	}
}


