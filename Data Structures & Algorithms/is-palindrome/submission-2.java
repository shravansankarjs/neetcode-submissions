class Solution {
    public boolean isPalindrome(String s) {
        /*
            1. Find the length of S
            2. for starting index of second string, length/2
            3. for loop and charAt to check palindrome
        */
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println(s.length());
        int left = 0;
        int right = s.length() - 1;

        for(; left < right; left++, right--) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
