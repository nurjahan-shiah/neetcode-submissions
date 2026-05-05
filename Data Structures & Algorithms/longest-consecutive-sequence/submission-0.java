class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        int result=0;

        for(int num: nums){
            if(!mp.containsKey(num)){
                mp.put(num, 
                mp.getOrDefault(num-1, 0) + mp.getOrDefault(num+1, 0) + 1);

                mp.put(num-mp.getOrDefault(num-1, 0),
                mp.get(num));

                mp.put(num+mp.getOrDefault(num+1, 0),
                mp.get(num));

                result=Math.max(result, mp.get(num));
            }
        }
        return result;
        
    }
}
