class Solution {
    public int search(int[] arr, int target) {
        return find(arr, target, 0, arr.length-1);
    }
    private int find(int[] arr, int target, int low, int high){
        if(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
             return mid;
            if(arr[mid] > target){
             return find(arr, target, low, mid-1);
            }
            return find(arr, target, mid+1, high);
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        Solution sol = new Solution();
        int res = sol.search(arr, target);
        System.out.println(res);
    }
}