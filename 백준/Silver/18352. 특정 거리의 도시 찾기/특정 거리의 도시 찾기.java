import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
     static int n, m, k, x;
    static ArrayList<Integer>[] city;
    static int[] visited;
    static List<Integer> answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        city = new ArrayList[n + 1];
        visited = new int[n + 1];
        answer = new ArrayList<>();
        for( int i = 0; i<n+1; i++){
            city[i] = new ArrayList<>();
            visited[i] = -1;
        }

        for( int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //단방향 연결
            city[a].add(b);
        }

        bfs(x);

        if( answer.isEmpty() ){
            sb.append(-1);
        } else {
            Collections.sort(answer);
            for( int i : answer ) sb.append(i).append("\n");
        }

        System.out.print(sb);


    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 0;

        while (!queue.isEmpty()){
            int cur = queue.poll();
            if( visited[cur] > k) break;
            if( visited[cur] == k ) answer.add(cur);

            for (int idx : city[cur]) {
                if( visited[idx] != -1 ) continue;
                visited[idx] = visited[cur]+1;
                queue.add(idx);
            }
        }
    }

}
