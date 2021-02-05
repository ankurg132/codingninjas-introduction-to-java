import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Write your code here
        String str;
        Scanner s = new Scanner(System.in);
        str = s.next();
        char ch = str.charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println(1);
        } else if (ch >= 97 && ch <= 122) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}