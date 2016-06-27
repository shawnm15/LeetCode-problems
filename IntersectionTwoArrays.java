public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set = new HashSet<Integer>();
    		for (int i = 0; i < nums1.length; i++) {
    			for (int j = 0; j < nums2.length; j++) {
    				if (nums1[i]==nums2[j]){
    					set.add(nums2[j]);
    					break;
    			  }
    				
    			}
    		}
    		Integer a3[]= new Integer [set.size()];
    		a3=set.toArray(a3);
		
		
    		int[] result = new int[a3.length];
    		for (int i = 0; i < a3.length; i++) {
    			result[i] = a3[i].intValue();
    		}
    		return result;
       
    }
}
