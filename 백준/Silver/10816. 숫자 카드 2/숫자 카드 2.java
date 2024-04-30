import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int[] searchArr, rangeArr, originArr;
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
	
        int n = Integer.parseInt(br.readLine());
        searchArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            searchArr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        originArr = new int[m];
        rangeArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<m; i++){
            rangeArr[i] = Integer.parseInt(st.nextToken());
            originArr[i] = rangeArr[i];
        }
        Arrays.sort(rangeArr);

        Map<Integer, Integer> map = new HashMap<>();
        for( int i : searchArr ){
            if( bSearch(i) ) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for( int i : originArr ){
            sb.append(map.getOrDefault(i, 0)).append(" ");
        }
        
        System.out.print(sb);

    }
    
    static boolean bSearch(int num){

        int left = 0;
        int right = rangeArr.length-1;

        while (left <= right){
            int mid = (right + left) / 2;

            if( rangeArr[mid] > num ){
                right = mid - 1;
            }else if(rangeArr[mid] < num){
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

}
