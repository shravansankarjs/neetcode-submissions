class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> numsSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        List<Integer> startSeq = new ArrayList<>();
        for(Integer num : numsSet) {
            if(!numsSet.contains(num-1)) {
                startSeq.add(num);
            }
        }

        int largestLength = 0;
        for(Integer i : startSeq) {
            int length = 1;
            while(numsSet.contains(i+1)) {
                length++;
                i++;
            }
            largestLength = Math.max(length, largestLength);
        }

        System.out.println(largestLength);
        return largestLength;
    }
}
