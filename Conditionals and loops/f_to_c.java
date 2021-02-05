import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int s, e, w;
        double res, temp;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        e = sc.nextInt();
        w = sc.nextInt();
        res = s;
        while (e >= res) {
            System.out.print((int) res + "\t");
            temp = (res - 32) * (5.0 / 9.0);
            System.out.print((int) temp + "\n");
            res += w;
        }
    }

}
