class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        1. HashMap with integer and its index
        2. loop through the array. 
        3. Check in map for target - num in key and index different than num's index
        4. If no, continue, If yes, return i and the index
        */

        Map<Integer, Integer> numMp = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if(numMp.containsKey(complement) && numMp.get(complement) != i) {
                return new int[] {numMp.get(complement), i};
            }

            numMp.put(num, i);
        }
        return new int[] {};
    }
}
