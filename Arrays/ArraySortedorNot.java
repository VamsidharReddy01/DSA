package Arrays;

public class ArraySortedorNot{

    static boolean check(int[] arr){
        boolean res = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) res = false;
         }

         return res;
    }
    public static void main(String[] args) {
        int arr[] = {33,44,55,66,77};
        System.out.println(check(arr));
    }
}