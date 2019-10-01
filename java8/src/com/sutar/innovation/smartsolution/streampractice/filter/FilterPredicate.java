package com.sutar.innovation.smartsolution.streampractice.filter;


import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterPredicate {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,3,32,3,5,6,6,6,33,22,16);
        System.out.println(numbers.stream().filter(p -> p%2 ==0).count());
        System.out.println(numbers.stream().count());
        System.out.println(numbers.size());
        System.out.println(numbers.stream().filter( p -> p> 10).collect(toList()));

    }

}
