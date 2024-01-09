import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Double a = Double.parseDouble(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a/b);
        
        br.close();        
    }
}