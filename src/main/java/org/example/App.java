package org.example;

public class App {

    public static void main( String[] args ) {
        Cat cat1 = new Cat("Red", 3, "No breed");
        Cat cat2 = new Cat("Red", 3, "No breed");
        Cat cat3 = new Cat("Gray", 4, "British");

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat2.equals(cat3));

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        actionsSchedule.actionPerform(cat1);
    }
}
