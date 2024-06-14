import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)){
                return new int[]{numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] res = new Solution().twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}