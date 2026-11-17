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
            String date = sc.next();
            String y = date.substring(0,4);
            int m = Integer.parseInt(date.substring(4,6));
            int d = Integer.parseInt(date.substring(6,8));
            if (m==2 && d >0 && d<29 ) {
                System.out.printf("#%d %s/%02d/%02d\n",test_case,y,m,d);
            } else if ( m%2==0 && m > 2 && m < 8 && d>0 && d <= 30) {
                System.out.printf("#%d %s/%02d/%02d\n",test_case,y,m,d);
            } else if ( m%2==0 &&m > 8 && d>0 && d <= 31) {
                System.out.printf("#%d %s/%02d/%02d\n",test_case,y,m,d);
            } else if ( m%2==1 && m < 9 && d>0 && d <= 31) {
                System.out.printf("#%d %s/%02d/%02d\n",test_case,y,m,d);
            } else if ( m%2==1 && m > 8 && d>0 && d < 31) {
                System.out.printf("#%d %s/%02d/%02d\n",test_case,y,m,d);
            } else {
                System.out.println("#" + test_case + " -1");
            }
		}
	}
}