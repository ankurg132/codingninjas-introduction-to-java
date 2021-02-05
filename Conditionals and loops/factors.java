import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}