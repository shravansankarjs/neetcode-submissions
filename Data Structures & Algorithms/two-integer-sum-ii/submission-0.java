class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //2 pointers - left most and right most
        //in each iteration, if target is larger than total then shift left to one
        // if otherwise, shift right pointer to left

        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        while(left < right) {
            if(numbers[left] + numbers[right] == target) {
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
            if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }
}
