package com.sutar.innovation.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {

    public static void main(String args[])
    {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("ArrayList practice");
        list.add("First");
        list.add("Second");

        synchronized (list)
        {
            Iterator itr = list.iterator();
            while (itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }






}
