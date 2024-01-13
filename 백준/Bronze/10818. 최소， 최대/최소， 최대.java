import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        int cnt = readInt();
        
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = readInt();
        } 
        
        int min = 1000001;
        int max = -1000001;
        for (int i = 0; i < cnt; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        sb.append(min).append(" ").append(max);

        System.out.print(sb);
    }
    
    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;
        int sign = 1;

        while ((val = System.in.read()) == '\n' || val == ' '){}

        while (val != '\n' && val != ' ') {
            if (val == '-') {
                sign = -1;
            } else {
                total = total * 10 + (val - '0');
            }
            val = System.in.read();
        }

        if (sign == -1) {
            total = -total;
        }

        return total;
    }
}