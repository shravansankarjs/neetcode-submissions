class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. hashmap of num and count
        //2. Array of k+1 length with index as the count
        //3. Loop through Map and add the key to array list w.r.t count
        //4. Traverse from end through array to add values to result array
        //5. return array after getting k values

        Map<Integer, Integer> countMp = new HashMap<>();

        for(int num: nums) {
            countMp.put(num, countMp.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] countArr = new List[nums.length+1];
        
        for(int i = 0; i<nums.length+1; i++) {
            countArr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : countMp.entrySet()) {
            countArr[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int resIndex = 0;

        for(int i = nums.length; i >=0 && resIndex < k; i--) {
            for(int num : countArr[i]) {
                result[resIndex] = num;
                resIndex++;
            }
        }

        return result;
    }
}
