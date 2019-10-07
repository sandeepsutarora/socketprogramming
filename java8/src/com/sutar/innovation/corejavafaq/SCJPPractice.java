package com.sutar.innovation.corejavafaq;

import java.util.Scanner;

public class SCJPPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        String str1[] = new String[10];
        for(int i=0; i<4;i++)
        {
            str = scan.next();
            str1[i] = str;
        }
        for(String str2: str1)
        {
            if ( str2!= null)
                System.out.println(str2);
        }

            }
}
