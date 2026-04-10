package Recursion;

public class Reverse_of_Arr {
    public static void reverse(int[] arr,int left,int right){
        if(left>=right) return;

        else{
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            reverse(arr, left+1, right-1);
        }
    }
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3,4,5};
        reverse(nums,0,nums.length-1);
        for(int n:nums){
            System.out.print(" "+n);
        }
    }
}
