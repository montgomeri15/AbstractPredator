package org.example;

public class ActionsSchedule {
    private String outAction;
    protected String actionPerform(Cat cat, int day){
        switch(day){
            case 2, 4, 6 -> outAction = cat.sleep();
            case 3, 5, 7 -> outAction = cat.hunt();
            case 1 -> outAction = cat.tygydyck();
            default -> outAction = cat.lickBalls();
        }
        return outAction;
    }
}
