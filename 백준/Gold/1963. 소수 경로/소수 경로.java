import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static boolean[] visited, prime;
    static int[] count;
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //에라토스테네스의 체 ( flase = 소수 )
        prime = new boolean[10000];
        prime[0] = prime[1] = true;
        for( int i = 2; i<10000; i++){
            if( !prime[i] ){
                for( int j = i+i; j<10000; j+=i){
                    prime[j] = true;
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        
        for( int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            visited = new boolean[10000];
            count = new int[10000];
            
            bfs(start);
            
            sb.append(count[end]).append("\n");
            
        }

        System.out.print(sb);
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){
            int curPass = queue.poll();
            
            for(int i = 0; i<4; i++){ // 비밀번호 4자리중 한자리
                for(int j = 0; j<10; j++){ // 변경할 수 ( 0~9 )
                    if( i == 0 && j == 0 ) continue; // 첫번째 자리가 0일수 없다 ( ex:0123 )
                    // 비밀번호 변경
                    int newPass = changePassword(curPass, i, j);
                    if( !visited[newPass] && !prime[newPass]){
                        queue.offer(newPass);
                        visited[newPass] = true;
                        count[newPass] = count[curPass] + 1;
                    }
                    
                }
            }
        }
    }
    
    static int changePassword(int num, int idx, int changeValue ){
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.setCharAt(idx, (char)(changeValue + '0'));
        return Integer.parseInt(sb.toString());
    }
}