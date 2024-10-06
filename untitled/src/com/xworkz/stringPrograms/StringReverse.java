package com.xworkz.stringPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String str="HAi HEllow";
        System.out.println("Reversed String is:"+reversedString(str));

    }

    public static String reversedString(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;

        while (start < end){
            char temp= ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
       return new String(ch);

    }
}
