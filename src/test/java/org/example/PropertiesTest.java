package org.example;

import org.junit.Test;
import org.properties.work.PropertiesFileReader;

import java.io.IOException;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

public class PropertiesTest {
    private PropertiesFileReader propertiesFileReader = new PropertiesFileReader();
    private Properties prop;
    {
        try {
            prop = propertiesFileReader.readPropertiesFile("src/main/java/resources/config.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void sleepActionTest(){
        assertThat(prop.getProperty("sleep.action")).isEqualTo("Zzzzz...");
    }
    @Test
    public void huntActionTest(){
        assertThat(prop.getProperty("hunt.action")).isEqualTo("Rawr! A real predator");
    }
    @Test
    public void tygydyckActionTest(){
        assertThat(prop.getProperty("tygydyck.action")).isEqualTo("TYGYDYCK-TYGYDYCK!");
    }
    @Test
    public void lickBallsActionTest(){
        assertThat(prop.getProperty("lickBalls.action")).isEqualTo("*Well, he licks his balls. Why are you staring?*");
    }
}
