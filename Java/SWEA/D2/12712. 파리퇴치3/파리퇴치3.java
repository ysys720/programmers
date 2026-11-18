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
            int[][] arr = new int[N][N];
            int max1 = 0;
            int max2 = 0;
            for ( int i = 0; i < N; i++ ) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i =0; i <N; i ++) {
                for (int j = 0; j <N; j++) {
                    int sum = arr[i][j];
                    for (int k = 1; k < M; k++) {
                        if ( i-k >=0) {
                        sum += arr[i-k][j];
                        }
                    
                        if ( i+k < N) {
                        sum += arr[i+k][j];
                        }
                                  
                        if ( j - k >=0) {
                            sum += arr[i][j -k];
                        }
                        
                        if ( j + k < N) {
                            sum += arr[i][j+k];
                        }
                    }
                    if (sum > max1) {
                            max1 = sum;
                    }
                }
            }
            for (int i =0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int sum = arr[i][j];
                    for (int k = 1; k < M; k++) {
                        if (i-k >= 0 && j - k >= 0) {
                            sum += arr[i-k][j-k];
                        }
                        if ( i-k >= 0 && j + k < N) {
                            sum += arr[i-k][j+k];
                        }
                        if ( i+k < N && j - k >= 0) {
                            sum += arr[i+k][j-k];
                        }
                        if ( i+k < N && j + k < N) {
                            sum += arr[i+k][j+k];
                        }
                    }
                     if (sum > max2) {
                            max2 = sum;
                    }
                }
            }
            int result = 0;
            if ( max1 >= max2 ) {
                result = max1;
            } else {
                result = max2;
            }
            System.out.println("#" + test_case + " " + result);            
		}
	}
}