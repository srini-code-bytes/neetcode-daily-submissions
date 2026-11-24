class Solution {
    public boolean hasDuplicate(int[] nums) {
        /* THIS WILL FAIL FOR UNSORTED ARRAYS */
        // int numCount = 1;
        // for(int i = 0; i< nums.length-1; i++) {
        //     if(nums[i] == nums[i+1]){
        //         numCount += 1;
        //     }
        // }
        // return numCount > 1 ? true  : false;

        /* FOR NON SORTED ARRAYS */

        Set<Integer> hSet = new HashSet<Integer>();
        for(int num : nums){
            if(hSet.contains(num)){
              return true;
            }
            hSet.add(num);
        }
        return false;
    }
}