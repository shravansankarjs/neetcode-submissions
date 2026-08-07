class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //1. Frequencey of each string -> Arr[26]
        //2. Key should be the Arr - Value should be list of strings
        //3. Loop through and send out the list of all values

        Map<String, List<String>> group = new HashMap<>();
        for(String str : strs) {
            int[] freqArr = new int[26];
            for(char c : str.toCharArray()) {
                freqArr[c - 'a']++;
            }
            String key = Arrays.toString(freqArr);
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(str);
        }

        return new ArrayList<>(group.values());
    }
}
