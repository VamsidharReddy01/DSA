

class NoOfDigits {

    int countofdigits(int num){
        int count =0;
        while(num != 0){
            num=num%10;
            count++;
        }
        retutn count;
    }
    public static void main (String args[]){

        System.out.print(countofdigits(123));
    }
}
