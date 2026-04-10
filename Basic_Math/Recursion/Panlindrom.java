package Recursion;

public class Panlindrom {
    public static boolean palin (String string,int l, int r){
        if(l>=r) return true;
        if(string.charAt(l)!=string.charAt(r)) return false;
        return palin(string,l+1,r-1);
        }     
    public static void main(String[] args) {
        String string = "mam";
        System.out.println(palin(string, 0, string.length()-1));
    }
}