class Solution {
    public int[] productExceptSelf(int[] nums) {
        //1. Get pre mul of all values before index in an array
        //2. Similarly another array with all values after the index
        //3. Multiply each index and get new array and return

        int[] preMul = new int[nums.length];
        preMul[0] = 1;

        for(int i = 1; i<nums.length; i++) {
            preMul[i] = preMul[i-1]*nums[i-1];
        }

        int[] postMul = new int[nums.length];
        postMul[nums.length-1] = 1;

        for(int i = nums.length-2; i>=0; i--) {
            postMul[i] = postMul[i+1]*nums[i+1];
        }

        int[] result = new int[nums.length];
        for(int i=0;i<nums.length; i++) {
            result[i] = preMul[i]*postMul[i];
        }

        return result;
    }
}  
