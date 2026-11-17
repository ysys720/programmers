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
            int d = 0;
            int b = 0;
            int N = sc.nextInt();
            for (int i =0; i < N; i++) {            
                int n = sc.nextInt();
                if (n == 1) {
                    int speed = sc.nextInt();
                    b +=speed;
                } else if (n==2) {
                    int speed = sc.nextInt();
                    b -=speed;
                    if (b < 0) {
                        b = 0;
                    }
                }
                d += b;
            }
            System.out.println("#" + test_case + " " + d);
		}
	}
}