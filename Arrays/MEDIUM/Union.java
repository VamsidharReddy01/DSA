package Arrays.MEDIUM;

public class Union {
    public static void main(String[] args) {
        int[] nums1={1,1,1,1,3};
        int[] nums2 = {1};
        int[] res=new int[(nums1.length+nums2.length)];
        int i=0,j=0,k=0;
        
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i]==res[k-1]) i++;
            if(j>0 && nums2[j]==res[k-1]) j++;
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }
            else if(nums1[i]==nums2[j]){
                res[k++]=nums1[i++];
                j++;
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            if(res[k-1]!=nums1[i]) res[k++]=nums1[i++];

            else i++;
        }
        while (j<nums2.length) {
            if(res[k-1]!=nums2[j]) res[k++]=nums2[j++];
            else j++;
        }
        for(int l=0;l<k;l++)  System.out.print(" "+res[l]);
    }    
}
