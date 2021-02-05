import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int sal = s.nextInt();
        String str = s.next();
        char grade = str.charAt(0);
        float totalSalary = (float) (sal + sal * 0.2 + sal * 0.5 - 0.11 * sal);
        totalSalary = Math.round(totalSalary);
        if (grade == 'A') {
            totalSalary += 1700;
        } else if (grade == 'B') {
            totalSalary += 1500;
        } else {
            totalSalary += 1300;
        }
        System.out.println((int) totalSalary);
    }
}
