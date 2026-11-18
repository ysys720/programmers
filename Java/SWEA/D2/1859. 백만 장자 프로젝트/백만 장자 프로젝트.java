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
            int N = sc.nextInt();
            int result = 0;
            int max = 0;
            long profit = 0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = N- 1; j >= 0; j--) {
                result = arr[j];
                if (result > max) {
                    max = result;
                } else {
                    profit += max - result;
                }
            }
            System.out.println("#" + test_case + " " + profit);
		}
	}
}