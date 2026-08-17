class Solution {
    public static boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        int org = x;
        int rev = 0;
        while(x!=0){
            rev = rev * 10 + (x % 10);
            x = x/10;
        } 
        return rev==org;
    }
    public static void main(String[] args){
        boolean res = isPalindrome(121);
        System.out.println(res);
    }
}