import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] originArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 0; i<n; i++){
            originArr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] searchArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<m; i++){
            searchArr[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(originArr);
        for( int i : searchArr ){
            int result = bSearch(originArr, i);
            System.out.println(result);
        }
	
    }
    
    static int bSearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right) / 2;

            if( key > arr[mid] ) left = mid + 1;
            else if( key < arr[mid] ) right = mid - 1;
            else return 1;
        }

        return 0;
    }

}