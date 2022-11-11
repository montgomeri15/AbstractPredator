package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ActionsTest {
    private final Cat testCat = new Cat("Red", 3, "No breed");

    /** Sleeping */
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) //MON, WED, FRI
    void catShouldSleep(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(sleepingCatSounds).isEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isEqualTo("Zzzzz...");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7}) //SUN, TUE, THU, SAT
    void catShouldNotSleep(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String sleepingCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(sleepingCatSounds).isNotEqualTo(testCat.sleep());
        assertThat(sleepingCatSounds).isNotEqualTo("Zzzzz...");
    }

    /** Hunting */
    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7}) //TUE, THU, SAT
    void catShouldHunt(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(huntingCatSounds).isEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isEqualTo("Rawr! A real predator");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 6}) //SUN, MON, WED, FRI
    void catShouldNotHunt(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String huntingCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(huntingCatSounds).isNotEqualTo(testCat.hunt());
        assertThat(huntingCatSounds).isNotEqualTo("Rawr! A real predator");
    }

    /** Tygydycking */
    @Test
    public void catShouldTygydyck(){
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String tygydyckingCatSounds = actionsSchedule.actionPerform(testCat, 1); //SUN

        assertThat(tygydyckingCatSounds).isEqualTo(testCat.tygydyck());
        assertThat(tygydyckingCatSounds).isEqualTo("TYGYDYCK-TYGYDYCK!");
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6, 7}) //MON, TUE, WED, THU, FRI, SAT
    void catShouldNotTygydyck(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String tygydyckingCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(tygydyckingCatSounds).isNotEqualTo(testCat.tygydyck());
        assertThat(tygydyckingCatSounds).isNotEqualTo("TYGYDYCK-TYGYDYCK!");
    }

    /** Balls licking */
    @Test
    public void catShouldLickBalls(){
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String lickingBallsCatSounds = actionsSchedule.actionPerform(testCat, 0);

        assertThat(lickingBallsCatSounds).isEqualTo(testCat.lickBalls());
        assertThat(lickingBallsCatSounds).isEqualTo("*Well, he licks his balls. Why are you staring?*");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7}) //SUN, MON, TUE, WED, THU, FRI, SAT
    void catShouldNotLickBalls(int dayOfWeekNumber) {
        ActionsSchedule actionsSchedule = new ActionsSchedule();
        String lickingBallsCatSounds = actionsSchedule.actionPerform(testCat, dayOfWeekNumber);

        assertThat(lickingBallsCatSounds).isNotEqualTo(testCat.lickBalls());
        assertThat(lickingBallsCatSounds).isNotEqualTo("*Well, he licks his balls. Why are you staring?*");
    }
}
