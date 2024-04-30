import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int[] rangeArr;
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
	
        int n = Integer.parseInt(br.readLine());
        rangeArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for( int i = 0; i<n; i++){
            rangeArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rangeArr);
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(key) - lowerBound(key)).append(" ");
        }

        System.out.print(sb);

    }
    
    static int upperBound(int key){
        int lo = 0;
        int hi = rangeArr.length;

        while (lo < hi){
            int mid = (lo + hi) / 2;

            if( key < rangeArr[mid]) hi = mid;
            else lo = mid+1;
        }

        return lo;
    }

    static int lowerBound(int key){
        int lo = 0;
        int hi = rangeArr.length;

        while (lo < hi){
            int mid = (lo + hi) / 2;

            if( key <= rangeArr[mid]) hi = mid;
            else lo = mid +1;

        }

        return lo;
    }

}
