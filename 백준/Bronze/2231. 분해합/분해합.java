import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = String.valueOf(n).length();
        int start = n - (size * 9);
        int ans = 0;
        
        for(int i = start; i < n; i++){
            int sum = i;
            int k = i;
            while(k > 0){
                sum += k % 10;
                k /= 10;
            }
            if(sum == n){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}