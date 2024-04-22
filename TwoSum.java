import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();   
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findTwoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Two numbers that add up to " + target + " are at indices " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
