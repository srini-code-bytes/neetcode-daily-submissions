class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* BRUTE FORCE
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
        */

        /* OPTIMIZED */

        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hMap.containsKey(complement)) {
                return new int[] {hMap.get(complement), i}; 
                // i is the current index, hMap.get(complement) is the index of the complement
                // but since they are asking to return the smaller index first
                // we return [hMap.get(complement), i] instead of [i, hMap.get(complement)] 
            }
            hMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
