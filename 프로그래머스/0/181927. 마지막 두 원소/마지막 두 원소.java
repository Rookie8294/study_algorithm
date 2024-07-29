class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int lastIdx = num_list.length - 1;
        int result = 0;
        
        if( num_list[lastIdx] > num_list[lastIdx - 1] ){
            result = num_list[lastIdx] - num_list[lastIdx - 1];
        } else {
            result = num_list[lastIdx]*2;
        }
        
        answer = new int[num_list.length + 1];
        for( int i = 0; i<num_list.length; i++ ) answer[i] = num_list[i];

        answer[answer.length - 1] = result;
        
        return answer;
    }
}