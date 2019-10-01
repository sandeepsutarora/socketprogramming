package com.sutar.innovation.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Trader {
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }

    public static void main(String args[])
    {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //find all transactions in the year 2011 and sort them by value
        List<Integer> transactionOf2011 = transactions.stream().filter(p->p.getYear() == 2011).map(Transaction::getValue).sorted().collect(toList());
        System.out.println(transactionOf2011);
        //what are all the unique cities where trader works
        List<Object> cities = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(toList());
        System.out.println(cities);
        //find all traders from city



    }
}

