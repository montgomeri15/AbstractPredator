package org.example;

import java.util.Calendar;

public class ActionsSchedule {
    private final int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    protected void actionPerform(Cat cat){
        switch(day){
            case 2, 4, 6 -> cat.sleep();
            case 3, 5, 7 -> cat.hunt();
            case 1 -> cat.tygydyck();
            default -> cat.lickBalls();
        }
    }
}
