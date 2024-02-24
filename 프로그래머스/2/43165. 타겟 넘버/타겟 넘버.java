class Solution {
    int[] numbers;
    int target;
    int answer;
    
    
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.target = target;
        this.numbers = numbers;
        
        dfs(0,0);
     
        return answer;
    }
    
    void dfs(int index, int sum){
        if( index == numbers.length){
            if( sum == target){
                answer++;
               
            }
             return;
        }        
        
        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
    
    
}