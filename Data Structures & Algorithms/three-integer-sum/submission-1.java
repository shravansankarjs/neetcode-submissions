class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1. 2 loops
        //2. first loop to fix one element as target
        //3. second loop with left most and right most pointer to  find out -target
        //4. add to Set<List<Integer>>
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int target = -1*nums[i];
            int left = i+1;
            int right = nums.length - 1;

            List<Integer> triplet = new ArrayList<>();

            while(left < right) {
                if(nums[left] + nums[right] == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.stream().toList();
    }
}
