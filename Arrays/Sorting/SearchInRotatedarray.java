package Arrays.Sorting;


public class SearchInRotatedarray {

    public static int search(int[] nums,int tar){

        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==tar) return mid;
            else if(tar>nums[mid] && tar<nums[end]) end=mid;
            else start=mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,7,0,1,2};
        int tar=5;
        System.out.println(" "+search(arr, tar));

    }

    
}
