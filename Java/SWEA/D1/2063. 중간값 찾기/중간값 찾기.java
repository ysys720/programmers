import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] n = new int[a];
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.print(n[n.length/2]);
	}
}