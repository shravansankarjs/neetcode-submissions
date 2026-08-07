class Solution {
    public int[] productExceptSelf(int[] nums) {
        //1. Get pre mul of all values before index in an array
        //2. Similarly another array with all values after the index
        //3. Multiply each index and get new array and return

        //1. first array with prefix mul of nums
        //2. use a suffix variable for storing postfix mul values
        //3. In the same loop that finds postfix mul, mul the suffix and prefix for result
        //4. return result

        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i = 1; i<nums.length; i++) {
            result[i] = result[i-1]*nums[i-1];
        }

        int suffix = 1;

        for(int i = nums.length-1; i>=0; i--) {
            result[i] = suffix*result[i];
            suffix = suffix*nums[i];
        }

        return result;
    }
}  
