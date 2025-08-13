import java.util.HashMap;

public class twoSum {
    public int[] twoSumMethod(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[]{i, seen.get(complement)};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
