package org.example;

import org.properties.work.PropertiesFileReader;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Cat extends Predator {
    private PropertiesFileReader propertiesFileReader = new PropertiesFileReader();
    private Properties prop;
    {
        try {
            prop = propertiesFileReader.readPropertiesFile("src/main/java/resources/config.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final String breed;

    public Cat(String color, int weight, String breed){
        super(color, weight);
        this.breed = breed;
    }

    protected String sleep() {
        return prop.getProperty("sleep.action");
    }

    protected String hunt() {
        return prop.getProperty("hunt.action");
    }

    protected String tygydyck() {
        return prop.getProperty("tygydyck.action");
    }

    protected String lickBalls() {
        return prop.getProperty("lickBalls.action");
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
