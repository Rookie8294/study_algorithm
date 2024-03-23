import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] distance = new long[N]; //거리 배열
        long[] cost = new long[N]; //비용 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (i == N-1) {
                distance[i] = 0;
                continue;
            }
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0; //비용의 합
        long minCost = cost[0]; //지금까지 최소 비용
        
        for (int i = 0; i < N; i++) {
            if (cost[i] < minCost) { //최소 비용보다 작을 경우
                minCost = cost[i]; //최소 비용 갱신
            }   
            sum += minCost * distance[i]; //최소비용으로 계산해서 더하기
        }

        System.out.println(sum);
    }//main

}//class