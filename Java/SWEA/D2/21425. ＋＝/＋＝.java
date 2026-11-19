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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc.nextInt();
            int count = 0;
            while (x<= N && y <= N) {
                if (x < y ) {
                    x += y;
                } else {
                    y += x;
                }
                count++;
            }
            System.out.println(count);
            
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}