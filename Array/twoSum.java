import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;

        // for(int i=0; i<nums.length; i++){
        //     int num = target - nums[i];
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[j]==num){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;


        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target-nums[i])) {
                ans[0] = i;
                ans[1] = hm.get(target-nums[i]);
                return ans;
            }
            hm.put(nums[i],i);
        }

        return ans;
    }
}