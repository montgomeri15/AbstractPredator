package org.example;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

public class ActionsTest {
    public int testDayOfWeek(int year, int month, int day){
        Calendar testCalendar = Calendar.getInstance();
        testCalendar.set(year, month, day);
        int dayOfWeek = testCalendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }

    /** Sleeping */
    @Test
    public void catShouldSleepMON(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 7);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(sleepingCatSounds).isEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isEqualTo("Zzzzz...");
    }
    @Test
    public void catShouldSleepWED(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 2);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(sleepingCatSounds).isEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isEqualTo("Zzzzz...");
    }
    @Test
    public void catShouldSleepFRI(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 4);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(sleepingCatSounds).isEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isEqualTo("Zzzzz...");
    }
    @Test
    public void catShouldNotSleepSUN(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 6);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(sleepingCatSounds).isNotEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isNotEqualTo("Zzzzz...");
    }

    /** Hunting */
    @Test
    public void catShouldHuntTUE(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 1);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(huntingCatSounds).isEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isEqualTo("Rawr! A real predator");
    }
    @Test
    public void catShouldHuntTHU(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 3);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(huntingCatSounds).isEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isEqualTo("Rawr! A real predator");
    }
    @Test
    public void catShouldHuntSAT(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 5);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(huntingCatSounds).isEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isEqualTo("Rawr! A real predator");
    }
    @Test
    public void catShouldNotHuntSUN(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 6);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(huntingCatSounds).isNotEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isNotEqualTo("Rawr! A real predator");
    }

    /** Tygydycking */
    @Test
    public void catShouldTygydyckSUN(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 6);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String tygydyckingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(tygydyckingCatSounds).isEqualTo(testCat.tygydyck());
        assertThat(tygydyckingCatSounds).isEqualTo("TYGYDYCK-TYGYDYCK!");
    }
    @Test
    public void catShouldNotTygydyckMON(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 7);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String tygydyckingCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(tygydyckingCatSounds).isNotEqualTo(testCat.tygydyck());
        assertThat(tygydyckingCatSounds).isNotEqualTo("TYGYDYCK-TYGYDYCK!");
    }

    /** Balls licking */
    @Test
    public void catShouldLickBalls(){
        Cat testCat = new Cat("Red", 3, "No breed");

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String lickingBallsCatSounds = actionsSchedule.actionPerform(testCat, 0);

        assertThat(lickingBallsCatSounds).isEqualTo(testCat.lickBalls());
        assertThat(lickingBallsCatSounds).isEqualTo("*Well, he licks his balls. Why are you staring?*");
    }
    @Test
    public void catShouldNotLickBallsSUN(){
        Cat testCat = new Cat("Red", 3, "No breed");
        int testDay = testDayOfWeek(2022, 10, 6);

        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String lickingBallsCatSounds = actionsSchedule.actionPerform(testCat, testDay);

        assertThat(lickingBallsCatSounds).isNotEqualTo(testCat.lickBalls());
        assertThat(lickingBallsCatSounds).isNotEqualTo("*Well, he licks his balls. Why are you staring?*");
    }
}
