public class MoveallZeros {
    public static void Move(int[] arr) {
        int j=arr.length-1;
    for(int i=j;i>=0;i--){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j--;
        }
    }
    for(;j>=0;j--){
        arr[j]=0;
    }
    for(int n: arr){
        System.out.print(" "+n);
    }
}
    public static void main(String[] args) {
        int[] arr={2,0,1,5,8,0,2,0};
        Move(arr);
    }
}
