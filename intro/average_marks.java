import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
		String name = s.next();
		char ch = name.charAt(0);
        int m1,m2,m3;
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();
        int avg = (m1+m2+m3)/3;
        System.out.println(ch);
        System.out.println(avg);
	}

}
