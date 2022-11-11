package org.example;

import java.util.Objects;

public abstract class Predator {
    private final String color;
    private final int weight;

    protected Predator(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    protected abstract String sleep();
    protected abstract String hunt();

    @Override
    public String toString() {
        return "Predator{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Predator predator = (Predator) o;

        if (weight != predator.weight) return false;
        return Objects.equals(color, predator.color);
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }
}
