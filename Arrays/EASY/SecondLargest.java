public class SecondLargest {
    public static int Seclarge(int[] arr){
        int Fmax=arr[0], Smax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Fmax){
                Smax=Fmax;
                Fmax=arr[i];
            }
            if(arr[i]>Smax && arr[i]!=Fmax) Smax=arr[i];

        }
        return Smax;
    }
    public static void main(String[] args){
        int[] arr= {68,5,22,12,35,2};
        System.out.println(Seclarge(arr));
    }
}
