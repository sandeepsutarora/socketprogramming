package com.sutar.innovation.corejavafaq.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class InitializeDate {
    private Date date;
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.YEAR,2019);
        this.date= calendar.getTime();
    }
    public static void main(String[] args) {
        System.out.println(new InitializeDate().date);
    }

}
