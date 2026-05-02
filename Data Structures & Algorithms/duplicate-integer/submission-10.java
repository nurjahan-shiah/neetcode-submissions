class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums == null || nums.length <= 1) return false;

        java.util.HashSet<Integer> seen = new java.util.HashSet<> ();

        for (int v: nums){
            if (seen.contains(v)){
                return true;
            }
            seen.add(v);
        }
        return false;

    }
}