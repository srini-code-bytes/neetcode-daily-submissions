class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hMap.put(nums[i], hMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                return key;
            }
        }
        return -1;
    }
}

/*
Time complexity — O(n) on average:
- The first loop goes through all n numbers and updates their counts. Each HashMap lookup or update
takes constant time on average.
- The second loop checks the counts until it finds the duplicate. In the worst case, it checks every
distinct number, which is at most n entries.
- Think of it as up to two passes. With 100 numbers, that’s 100 visits to count them and at most 100
more to check the counts. The loops run one after the other, so their costs add. O(n + n) simplifies
to O(n).

Space complexity — O(n) extra space:
- The HashMap stores one entry per distinct number. Each entry holds the number and its count.
- If almost every number is different, the map holds almost as many entries as the array. For
example, [1, 2, 3, 4, 4] needs four entries for five numbers.
- The map is the extra storage that this solution creates. The input array was already given to you,
so it doesn’t count toward extra space.
*/