import java.util.Scanner;
import java.lang.StringBuilder;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
                
        String[] strArr = a.split("");
        for (String str : strArr) {
            if( Character.isLowerCase(str.codePointAt(0))) sb.append(str.toUpperCase());
            else sb.append(str.toLowerCase());
        }

        System.out.print(sb);
        
    }
}