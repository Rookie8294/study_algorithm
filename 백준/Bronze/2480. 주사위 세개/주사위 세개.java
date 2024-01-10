import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int result = 0;
        
        for( int i = 0; i<3; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        for( int j = 0; j<list.size(); j++){
            if( j != list.indexOf(list.get(j)) ){
                count++;
                result = 1000 + list.get(j) * 100;
            }
        }
        
        if( count == 2 ){
            result *= 10;
        } else if( count == 0){
            list.sort(Comparator.reverseOrder());
            result = list.get(0) * 100;
        }
        
        
        System.out.println(result);
        

	}
}