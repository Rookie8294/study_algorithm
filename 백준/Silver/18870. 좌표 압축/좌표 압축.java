import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
    
public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
		int[] originArr = new int[N];
		int[] sortedArr = new int[N];
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for( int i = 0; i<N; i++) {
			originArr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sortedArr);
		
		int rank = 0;
		for( int v : sortedArr ) {
			if( !map.containsKey(v)) {
				map.put(v, rank);
				rank++;
			}
		}
		
		for( int k : originArr ) {
			sb.append(map.get(k)).append(" ");
		}
        
        System.out.print(sb);
    }
}