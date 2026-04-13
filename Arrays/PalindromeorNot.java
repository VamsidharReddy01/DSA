package Arrays;

public class PalindromeorNot {

    static boolean check(int[] arr){
        boolean res = true;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                res = false;
                break;
            }
            else{
                i++;
                j--;
            }2
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2};
        System.out.println(check(arr));
    }
}
