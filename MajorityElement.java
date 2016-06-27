import java.util.*;
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) > (Math.floor(nums.length/2))){
				return nums[i];
				//System.out.println(nums[i]);
				
			}
		}
		return -1;
    }
}
