public class Solution {
    public boolean isHappy(int n) {
        String s = String.valueOf(n);

		String temp = s;
		int sum = 0;
		int counter = 0;
		Map hm = new HashMap();
		while (true) {

			for (int i = 0; i < temp.length(); i++) {
				sum += Math.pow(temp.charAt(i) - '1' + 1, 2);

			}
			if (sum == 1) {
				return true;
			} else {
				temp = String.valueOf(sum);
				sum = 0;
				if (hm.containsKey(temp)) {
					return false;
				} else {
					hm.put(temp, counter);
				}
			}

		}
    }
}
