public class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 1;

        for(int pile:piles){
            if (pile> high){
                high = pile;
            }
        }
        while(low < high){
            int k = low + (high-low)/2;
            long time = 0;
            for (int pile:piles){
                time += (pile+k-1L)/k;
            }
            if (time <= h){
                high=k;
            }else{
            low = k+1;
            }
        }
        return low;
    }
}