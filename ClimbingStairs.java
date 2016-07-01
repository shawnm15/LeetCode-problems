public class Solution {
    public int climbStairs(int n) {
        int n1 = 0;
		int n2 = 1;
		int n3=0;
		if (n==0 || n==1){
			return 1;
		}else if(n==2){
			return 2;
			
		}
		for (int i = 1; i < n+1; ++i) {
			n3 = n1 + n2;
			if (i==n){
			    return n3;
			}
			n1 = n2;
			n2 = n3;
			
		}
		return -1;
    }
}
