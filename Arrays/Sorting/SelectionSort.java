package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr=new int[]{2,3,4,5,1,2};
        for(int i=0;i<arr.length;i++){
            int select = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[select]){
                    select=j;
                }
            }
            if(select!=i){
                int temp  = arr[select];
                arr[select]=arr[i];
                arr[i]=temp;
            }
        }
        for(int n:arr){
            System.out.print(" "+n);
        }
    }
}
