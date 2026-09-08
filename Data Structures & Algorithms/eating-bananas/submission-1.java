class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            if (pile > high) high = pile;
        }

        while (low < high) {
            int speed = low + (high - low) / 2;
            long total = 0;
            for (int pile: piles){
                total += (pile + speed - 1L) / speed;
            }
            if (total <= h){
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return low;
    }
}