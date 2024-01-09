import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int n100 = b/100;
        int n10 = b/10 - n100*10;
        int n1 = b - n100*100 - n10*10;
        
        System.out.println(a*n1);
        System.out.println(a*n10);
        System.out.println(a*n100);
        System.out.println(a*b);          
        
        br.close();

	}
}