class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
        for (int push : array) {
            if (push > height) result++;
        }
        return result;
    }
}