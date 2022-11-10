package org.example;

import java.util.Objects;

public class Cat extends Predator {
    private String breed;

    public Cat(String color, int weight, String breed){
        super(color, weight);
        this.breed = breed;
    }

    protected void sleep() {
        System.out.println("Zzzzz...");
    }

    protected void hunt() {
        System.out.println("Rawr! A real predator.");
    }

    protected void tygydyck() {
        System.out.println("TYGYDYCK-TYGYDYCK!");
    }

    protected void lickBalls() {
        System.out.println("*Well, he licks his balls. Why are you staring?*");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}' +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return Objects.equals(breed, cat.breed) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return breed != null ? breed.hashCode() : 0;
    }
}
