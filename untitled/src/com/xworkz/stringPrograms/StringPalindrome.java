package com.xworkz.stringPrograms;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="Niti";
        if (isPalindrome(str)){
            System.out.println("this is palindrome");
        }else {
            System.out.println("this is not palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        String str1=str.toLowerCase();

        char[] ch= str1.toCharArray();
        int start=0;
        int end=ch.length-1;

        while (start < end){
            char tmp= ch[start];
            ch[start]=ch[end];
            ch[end]=tmp;

            start++;
            end--;
        }
        String rslt=new String(ch);
        return str1.equals(rslt);

    }
}
