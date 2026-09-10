class Solution {
    public static boolean xorGame(int[] nums) {
        int xor = 0;
        for(int n : nums){
            xor ^= n;
        }
        // Alice wins if the total XOR is already 0, 
        // or if he starts with an even number of elements.
        return xor == 0 || nums.length % 2 == 0; 
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(xorGame(nums));
    }
}