class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int num1 = Integer.parseInt(String.valueOf(a) + b);
        int num2 = 2 * a * b;
        
        if( num1 < num2 ) answer = num2;
        else answer = num1;
        
        
        
        
        return answer;
    }
}