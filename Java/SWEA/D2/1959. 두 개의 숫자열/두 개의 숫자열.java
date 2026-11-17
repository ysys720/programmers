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
            int M = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[M];
            int max = 0;
            for (int i =0; i < N; i++) {
                a[i] = sc.nextInt();
            } for (int j = 0; j < M; j++) {
                b[j] = sc.nextInt();
            }
            if ( N <= M) {
                for (int i = 0; i <= M-N; i++) {
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                    sum += a[j] * b[i + j];
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            } else {
                            for(int i = 0; i <= N-M; i++) {
                                int sum = 0;
                                for (int j =0; j < M; j++) {
                                    sum += a[i + j] * b[j];
                                }
                                if (sum > max) {
                                    max = sum;
                                }
                            }
            }
            System.out.println("#" + test_case + " " + max);
		}
	}
}