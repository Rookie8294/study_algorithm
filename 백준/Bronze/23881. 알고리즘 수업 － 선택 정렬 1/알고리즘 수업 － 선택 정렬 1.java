import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        String[] arr = br.readLine().split(" ");
        int[] target = new int[arr.length];
        for( int i = 0; i<target.length; i++) target[i] = Integer.parseInt(arr[i]);
        
        //sort
        boolean result = selectionSort(target, k);
        
        if( !result ) System.out.println(-1);
        

    }//main
    
    public static boolean selectionSort(int[] arr, int k){
        int index;
        int temp = 0;
        int cnt = 0;
        int n = arr.length;

        for( int i = n-1; i>0; i--){
            index = i;
            for( int j = i - 1; j>=0; j--){
                if( arr[j] > arr[index] ){
                    index = j;
                }

            }

            //swap

            if( index != i ) { // 이미 선택한 자리의 수가 다른 요소들 보다 클 때( 이미 정렬된 경우 )
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                cnt++;

                if( cnt == k ) {
                    System.out.print(arr[index] + " " + arr[i]);
                    return true;
                }

            }
        }

        return false;
       
    }//selectionSort
    
}//class