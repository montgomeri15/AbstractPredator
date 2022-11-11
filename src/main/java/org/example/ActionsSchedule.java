package org.example;

import java.util.Calendar;

public class ActionsSchedule {
    private final int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    protected void actionPerform(Cat cat){
        switch(day){
            case 2, 4, 6 -> System.out.println(cat.sleep());
            case 3, 5, 7 -> System.out.println(cat.hunt());
            case 1 -> System.out.println(cat.tygydyck());
            default -> System.out.println(cat.lickBalls());
        }
    }
}
