package com.sutar.innovation.corejavafaq.string;

public class ExtractaAndSumNumbersFromString {
    private static final char MARKER_FOR_REMOVAL=' ';
    public static void main(String[] args) {
        System.out.println(getSumOfNumbers("1 some text more text 4 more text 8 and 2 people"));
        System.out.println(removeCharacter("Absolute"));
        System.out.println(removeCharacter("base"));
        System.out.println(removeCharacter("Ant"));
        System.out.println(removeCharacter("ubiquitous"));
        System.out.println(removeConsecutiveCharacters("aaab",2));
        System.out.println(removeConsecutiveCharacters("aaabbbbbbbcccccccccccccccccccccccccccc",2));
    }
    private static int getSumOfNumbers(String str)
    {
        int sum =0;
        String[] input = str.split("\\s+");
        for(String s: input)
        {
            int nextNumber = 0;
            try
            {
                nextNumber = Integer.parseInt(s);
                sum = sum + nextNumber;
            }catch (NumberFormatException e)
            {

            }
        }
        return sum;
    }
    private static String removeCharacter(String str)
    {
        String input = str.toLowerCase();
        String firstCharacter = (input.length() > 0 && input.charAt(0) == 'a') ? "a" : "";
        String secondCharacter = (input.length() > 1 && input.charAt(1) == 'b') ? "b" : "";
        String remaining = input.length()> 2 ? input.substring(2) : "";
        return firstCharacter + secondCharacter + remaining;
    }
    private static String removeConsecutiveCharacters(String input, int allowedRepetations)
    {
        //return original String if string is not of sufficient length.
        if (allowedRepetations >= input.length()) return input;

        char[] str = input.toCharArray();
        char lastChar = str[0];
        int count=1;
        for(int i =1; i< str.length; i++)
        {

            if (lastChar == input.charAt(i) )
            {
                ++count;
                lastChar=str[i];
                if(count > allowedRepetations)
                {
                    str[i] = MARKER_FOR_REMOVAL;
                }
            }
            else
            {
                count=1;
                lastChar=str[i];
            }
        }

        String output = new String(str);
        String result = output.replaceAll(" ","");
        return result;

     }
}
