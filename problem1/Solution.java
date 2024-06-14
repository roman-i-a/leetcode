class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // if (Math.abs(nums[i]) > Math.abs(target)) {
            //     continue;
            // }

            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[j] == nums[i]) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] res = new Solution().twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}