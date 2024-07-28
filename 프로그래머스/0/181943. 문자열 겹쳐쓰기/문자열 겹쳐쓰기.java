import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        int middleLength = overwrite_string.length();
        int myStringLength = my_string.length();
        String answer = "";
        
        //첫 문자열 입력
        for( int i = 0; i<s; i++) sb.append(my_string.charAt(i));
        //중간 문자열 입력
        for( int i = 0; i<middleLength; i++) sb.append(overwrite_string.charAt(i));
        //마지막 문자열 입력
        for( int i = middleLength+s; i<myStringLength; i++) sb.append(my_string.charAt(i));
        
        
        return sb.toString();
        
        
    }
}