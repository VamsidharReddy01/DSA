class Palindrom {
    public static void main(String[] args) {
        int num=222;
        int temp=num;
        int rev_num=0;
        int n=0;
        while(num >= 0){
            n=num%10;
            rev_num*=rev_num+(num%10);
            num/=10;
        }
        if(temp == rev_num) System.out.println("Ture");
        else
        {
            System.out.println("False");
        }
    }

}
