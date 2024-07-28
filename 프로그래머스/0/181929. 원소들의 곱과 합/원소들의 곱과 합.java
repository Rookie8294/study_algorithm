class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multi = 1;
        
        for( int i : num_list ) {
            multi *= i;
            sum += i;        
        } 
        sum *= sum;
        
        if( multi < sum ) answer = 1;
        else answer = 0;
        
        return answer;
    }
}