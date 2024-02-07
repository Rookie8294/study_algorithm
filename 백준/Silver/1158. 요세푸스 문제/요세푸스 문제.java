import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        for(int i = 1; i<N+1; i++){
            list.add(i);
            linkedList.add(i);
        }


        sb.append("<");
        while ( !linkedList.isEmpty() ){
            for(int i = 0; i<K; i++){
                if( i == K-1){
                    if( linkedList.size() == 1 ) {
                        sb.append(linkedList.remove());
                    } else {
                        sb.append(linkedList.remove()).append(", ");
                    }
                } else {
                    linkedList.add(linkedList.remove());
                }
            }
        }
        sb.append(">");

        System.out.println(sb);

        br.close();
	}
}
