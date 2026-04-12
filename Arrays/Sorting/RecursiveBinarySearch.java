package Arrays.Sorting;

public class RecursiveBinarySearch {
    public static int search(int[] nums,int target,int start,int end){
            if(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target){
                    return (mid+1);
                }
                if(target>nums[mid]) return (search (nums,target,mid+1,end));
                else return (search(nums,target,start,mid-1));
            }
            return -1;
    }
    public static void main(String[] args){
        int[] nums= new int[]{3,5,6,8,12,21,28};
        int target=21;
        int res=search(nums, target,0,nums.length);
        System.out.println(res);
    }
}

