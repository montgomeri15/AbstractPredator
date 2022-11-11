package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualsTest {
    @Test
    public void catsAreEqual(){
        Cat testCat1 = new Cat("Red", 3, "No breed");
        Cat testCat2 = new Cat("Red", 3, "No breed");

        assertThat(testCat1).isEqualTo(testCat2);
    }

    @Test
    public void catsAreNotColorEqual() {
        Cat testCat1 = new Cat("Red", 3, "No breed");
        Cat testCat2 = new Cat("Gray", 3, "No breed");

        assertThat(testCat1).isNotEqualTo(testCat2);
    }

    @Test
    public void catsAreNotWeightEqual() {
        Cat testCat1 = new Cat("Red", 3, "No breed");
        Cat testCat2 = new Cat("Red", 4, "No breed");

        assertThat(testCat1).isNotEqualTo(testCat2);
    }

    @Test
    public void catsAreNotBreedEqual() {
        Cat testCat1 = new Cat("Red", 3, "No breed");
        Cat testCat2 = new Cat("Red", 3, "British");

        assertThat(testCat1).isNotEqualTo(testCat2);
    }
}
