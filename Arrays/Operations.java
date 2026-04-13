package Arrays;

public class Operations {
    static int[]  insert(int[] arr, int value,int pos){
        int[] Narr = new int[arr.length+1];
        int i=0;
        int j=0;
        while(i<Narr.length && j < arr.length){
            if(i == pos){
                Narr[i++] = value;
            }
            else{
                Narr[i++] = arr[j++];
            }
        }
        return Narr;
    }
    static int[] delete(int[] arr, int pos){
         int[] Narr = new int[arr.length-1];
        for(int i= 0; i<Narr.length;i++){
            //System.out.println(arr[i]+"  "+arr[i+1]);
            if(i >= pos){
                Narr[i] = arr[i+1];
            }
            else{
                Narr[i] = arr[i];
            }
        }
        return Narr;
    }
    public static void main(String[] args) {
        int arr[] = {33,34,36,37,38};
        int pos =2;
        int value = 35;
        for(int x: delete(arr, 2)){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x: insert(arr, value, pos)){
            System.out.print(x+ " ");
        }
    }
}
