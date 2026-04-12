public class LargestEle {
    public static int Largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr=new int[]{2,65,23,12,76,25};
        System.out.println(Largest(arr));

    }
}
