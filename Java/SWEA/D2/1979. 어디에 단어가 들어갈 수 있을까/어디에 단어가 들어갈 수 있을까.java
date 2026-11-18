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
            int K = sc.nextInt();
            int ans = 0;
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i <N; i++) {
                int counta = 0;
                int countb = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        counta++;
                    } else if (counta == K) {
                        ans++;
                        counta = 0;
                    } else {
                        counta = 0;
                    }
                    if (arr[j][i] == 1) {
                        countb++;
                    } else if (countb == K) {
                        ans++;
                        countb = 0;
                    } else {
                        countb = 0;
                    }
                }
                    if (counta == K) {
                    ans++;
                    }
                    if (countb == K) {
                    ans++;
                }
            }
            System.out.println("#" + test_case + " " + ans  );
		}
	}
}