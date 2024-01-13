import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<Integer>();
        String line;
        int num = 0;
        while( (line = br.readLine()) != null ){
            num = Integer.parseInt(line)%42;
            set.add(num);
        }
        
        System.out.println(set.size());

        br.close();
	}
}