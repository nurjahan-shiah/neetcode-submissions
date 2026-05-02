class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for (String s: strs){

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sortedS = new String(charArray);

            // now keep the key in the hash map if exist, or create a new one

            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }
        return new ArrayList<>(result.values());
        
    }
}


