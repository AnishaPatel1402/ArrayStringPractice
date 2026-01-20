class Solution {
    //leetcode 26
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 1;  
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];  //only unique elements will be keep at position idx
            }
        }
        return idx;  //idx will point to the element which is length of unique elementary 
    }
}