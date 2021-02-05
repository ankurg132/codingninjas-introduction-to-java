import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (val != 0) {
            int temp = val % 10;
            if (temp % 2 == 0) {
                evenSum += temp;
            } else {
                oddSum += temp;
            }
            val = val / 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
