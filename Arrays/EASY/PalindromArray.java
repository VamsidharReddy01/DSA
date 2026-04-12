public class PalindromArray {
    public static boolean palin(int[]arr){
        int j = arr.length-1;
        int i=0;
        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 1,1};
        System.out.println(palin(arr));
    }
}
