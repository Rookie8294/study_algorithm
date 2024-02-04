import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for( int k = 0; k<N; k++){
            String[] arr = br.readLine().split(" ");
		    for(int i=0; i<arr.length; i++) {
			    for( int j = arr[i].length()-1; j>=0; j--) {
				    sb.append(arr[i].charAt(j));
			    }//end for
			    sb.append(" ");
		    }//end for
            sb.append("\n");
        }//end for
        
        System.out.print(sb);
    }//main
}//class