import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        Long n = Long.parseLong(st.nextToken());
        Long m = Long.parseLong(st.nextToken());

        Long five = zeroCount(n, 5) - zeroCount((n-m), 5) - zeroCount(m,5);
        Long two = zeroCount(n, 2) - zeroCount((n-m), 2) - zeroCount(m, 2);
        Long result = Math.min(five, two);

        System.out.println(result);

        br.close();
	}
    
    public static Long zeroCount(Long num, int divisor){
        Long count = 0L;
        while (num >= divisor ){
            count += num / divisor;
            num /= divisor;
        }
        return count;
    }
}