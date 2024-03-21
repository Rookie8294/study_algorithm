import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int k, n, max;
    static boolean[] abc;
    static String[] words;
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        abc = new boolean[26];
        words = new String[n];
        max = 0;

        int result = 0;
        for( int i = 0 ; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            words[i] = word;
        }

        recur(0,0);

        System.out.println(max);
        

        br.close();
	}
    static void recur(int depth, int idx){
        if( depth == k) {
            int count = 0;
            for( int i = 0; i<n; i++){
                String word = words[i];
                boolean read = false;
                for( int j = 0; j<word.length(); j++){
                    if( !abc[word.charAt(j) - 97] ){
                        read = true;
                        break;
                    }
                }
                if( !read ) count++;
            }
            max = Math.max(max, count);
            return;
        }

        for( int i = idx; i<abc.length; i++){
            if( !abc[i]){
                abc[i] = true;
                recur(depth+1, i);
                abc[i] = false;
            }
        }


    }
}