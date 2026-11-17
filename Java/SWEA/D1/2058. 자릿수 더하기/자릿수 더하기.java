import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                int a = n%10;
                sum += a;
                n = n/10;
            }
            System.out.print(sum);
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

		
	}
}