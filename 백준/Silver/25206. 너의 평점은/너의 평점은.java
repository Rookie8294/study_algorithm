import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
       String[] input = new String[3];
        String target = "";
        int P = 0;
        double sum = 0.0;
        double objScore = 0.0;
        double totalScore = 0.0;
        for( int i = 0; i<20; i++){
           input = br.readLine().split(" ");
           target = input[2];
           objScore = Double.parseDouble(input[1]);



        switch (target){
            case "A+":
                sum += 4.5*objScore;
                break;
            case "A0":
                sum += 4.0*objScore;
                break;
            case "B+":
                sum += 3.5*objScore;
                break;
            case "B0":
                sum += 3.0*objScore;
                break;
            case "C+":
                sum += 2.5*objScore;
                break;
            case "C0":
                sum += 2.0*objScore;
                break;
            case "D+":
                sum += 1.5*objScore;
                break;
            case "D0":
                sum += 1.0*objScore;
                break;
            case "F":
                sum += 0.0*objScore;
                break;
            case "P":
                P++;
                continue;
        }

            totalScore += objScore;

       }

        System.out.print(sum/totalScore);

        br.close();
	}
}