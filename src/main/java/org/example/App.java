package org.example;

import java.util.Calendar;

public class App {
    //Не через Enum, а з визначенням поточного дня тижня
    private static final int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    public static void main( String[] args ) {
        Cat cat1 = new Cat("Red", 3, "No breed");
        Cat cat2 = new Cat("Red", 3, "No breed");
        Cat cat3 = new Cat("Gray", 4, "British");

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat2.equals(cat3));

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        System.out.println(actionsSchedule.actionPerform(cat1, day));
    }
}
