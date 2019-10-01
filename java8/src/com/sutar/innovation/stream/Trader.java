package com.sutar.innovation.stream;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
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
        List<String> cities = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(toList());
        System.out.println(cities);
        //find all traders from city Cambridge
        List<Trader> cambridgeTraders = transactions.stream().map(p->p.getTrader()).filter(t ->t.getCity().equals("Cambridge")).distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(cambridgeTraders);

        //Return a string of all traders names sorted alphabetically.

        String traderStr = transactions.stream().map(t -> t.getTrader().getName())
                            .distinct()
                            .sorted()
                            .reduce("", (n1,n2) -> n1 +" "+n2);
        System.out.println(traderStr);  // String are getting concatenated so not efficient.
            traderStr = transactions.stream().map(t -> t.getTrader().getName())
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining(" ह " ));
        System.out.println(traderStr); //This internally makes a stringBuilder so it's efficient
        //Are any trader is based in Milan?
        boolean milanBased = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);
        //Print all transactions values from the traders living Cambridge
        transactions.stream().filter( t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highestValue of transactions
        Optional<Integer> highestValue;
        highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println("Highest Value Transaction: "+highestValue.get());

        //find the transaction with smallest value
        Optional<Transaction> smallestTransaction = transactions.stream().reduce((t1,t2) -> t1.getValue() < t2.getValue() ? t1: t2);
        System.out.println("Smallest Transaction: "+ smallestTransaction.get());



    }
}

