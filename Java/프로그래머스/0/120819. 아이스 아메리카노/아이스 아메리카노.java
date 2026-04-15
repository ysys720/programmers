class Solution {
    public int[] solution (int money) {
        int price = 5500;
        int cup = money / price;
        int remain = money % price;
        int[] answer = {cup, remain};
        return answer;
    }
}