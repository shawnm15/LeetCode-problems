import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] chars = s.toCharArray();
		    char[] chars1 = t.toCharArray();
		    Arrays.sort(chars);
		    Arrays.sort(chars1);
		    String sorted = new String(chars);
		    String sorted1 = new String(chars1);
				
				return sorted.equals(sorted1);
    }
}
