class Solution {
    public boolean isPalindrome(int x) {
    	//Integer obji= new Integer(x);
        String xString= Integer.toString(x);
        //System.out.println(xString);
        StringBuilder sb = new StringBuilder();
        sb.append(xString);
        sb.reverse();
        String rev= sb.toString();
        //System.out.println(rev);
        return xString.equals(rev);
    }
}
public class Palindrome {
public static void main(String[] args) {
	Solution sol=new Solution();
	boolean result= sol.isPalindrome(-121);
	System.out.print(result);
}
}
