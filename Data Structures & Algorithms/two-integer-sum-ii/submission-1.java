class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0, next = numbers.length-1;

        while(start<next){
            int currentSum = numbers[start]+numbers[next];

            if(currentSum > target){
                next--;
            }else if (currentSum < target){
                start++;
            }else{
                return new int[] {start+1, next+1};
            }
        }
        return new int[0];
        
    }
}
