package com.sutar.innovation.corejavafaq.string;

import java.util.Random;

public class CountCharactersInString {

    public static void main(String[] args) {
        String str = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        str = str + str + str + str + str +str + str+ str + str +str + str+ str + str +str + str;
        str = str + str + str + str + str +str + str + str +str + str+ str + str +str + str;
        str = str + str + str + str + str +str + str + str +str + str+ str + str +str + str;
        str = str + str + str + str + str +str + str + str +str + str+ str + str +str + str;



        Random r = new Random();

        for (Long l=0l;l<=Integer.MAX_VALUE;l++)
        {

            String n = str.substring(0)+ r.nextInt();;
        }
        System.out.println(countA(str));
        try
        {
            Thread.sleep(500);
        }catch (InterruptedException e)
        {

        }
    }

    private static Long countA(String input)
    {
        Long count = 0L;
        if( input ==null || input.length() ==0 )
            return 0L;

        if( input.substring(0,1).equals("A"))
        {
            ++count;
        }

        return count + countA(input.substring(1));
    }
}

