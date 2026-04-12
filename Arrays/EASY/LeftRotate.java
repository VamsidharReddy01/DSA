public class LeftRotate {
    public static void LRotate(int[] nums,int k){
        if(k>nums.length)k=k%nums.length;
        Rotate(nums, 0, nums.length-(k+1));
        Rotate(nums, nums.length-k, nums.length-1);
        Rotate(nums, 0, nums.length-1);
        for(int n:nums) System.out.print(" "+n);        
    }
    public static void  Rotate(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums= {3,2,5,1,6,1,9};
        int k=3;
        LRotate(nums, k);

    }
}
