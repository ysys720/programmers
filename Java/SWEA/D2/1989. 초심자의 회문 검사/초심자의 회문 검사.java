import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int result = 1;

                String a = sc.next();
                for (int j = 0; j <a.length()/2; j++) {
                    if ( a.charAt(j) != a.charAt(a.length()- 1 - j) ) {
                        result = 0;
                        break;
                    }
                }
            System.out.println("#" +test_case + " " + result);
		}
	}
}