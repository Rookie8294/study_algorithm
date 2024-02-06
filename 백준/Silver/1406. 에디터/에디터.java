import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        String target = br.readLine();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(target);

        LinkedList<String> list = new LinkedList<String>();
        for(String str : target.split("")){
            list.add(str);
        }

        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()){
            iter.next();
        }

        while (N-- > 0){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "P" :
                    iter.add(st.nextToken());
                    break;
                case "L" :
                    if( iter.hasPrevious() ){
                        iter.previous();
                    }
                    break;
                case "D" :
                    if( iter.hasNext() ){
                        iter.next();
                    }
                    break;
                case "B" :
                    if( iter.hasPrevious() ){
                        iter.previous();
                        iter.remove();
                    }
                    break;
            }
        }

        System.out.println(String.join("",list));
        

        br.close();
	}
}