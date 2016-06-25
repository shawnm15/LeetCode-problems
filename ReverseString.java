public class Solution {
    public String reverseString(String s) {
        char[] array = new char[s.length()];
        for(int i=array.length - 1, j = 0; i >= 0; i--, j++) {
            array[i] = s.charAt(j);
        }
        return new String(array);
    }
}
