package com.sutar.innovation.corejavafaq.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "new";
        if (str == null)
            return;
        System.out.println(new StringBuilder(str).reverse().toString());
        System.out.println(reverse(str));
        try
        {
            Thread.sleep(50000);
        }catch (InterruptedException e){}
    }

    private static String reverse(String str)
    {
        if( str == null || str.length() < 1)
            return str;

        return reverse(str.substring(1))+ str.charAt(0);
    }
}
