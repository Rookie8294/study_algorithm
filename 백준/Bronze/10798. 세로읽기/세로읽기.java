import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        String input;
        String[] aa = new String[15];
        String[][] arr = new String[5][15];
        for(int i = 0; i<arr.length; i++){
            aa = br.readLine().split("");
            for( int j = 0; j<aa.length; j++){
                arr[i][j] = aa[j];
            }
        }

        String target;
        for( int i = 0; i<arr[0].length; i++){
            for( int j = 0; j<arr.length; j++){
                if( arr[j][i] != null ){
                    sb.append(arr[j][i]);
                } else {
                    continue;
                }
            }
        }
        
        System.out.print(sb);

        br.close();
	}

}