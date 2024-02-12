import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String line = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, 0);

        for(int i = 0; i<line.length(); i++){
            char c = line.charAt(i);
            arr[c - 97]++;
        }
        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
	}
}