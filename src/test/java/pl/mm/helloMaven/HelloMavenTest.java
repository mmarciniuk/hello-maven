package pl.mm.helloMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloMavenTest {

    @Test
    public void testSayHelloToMavenWorld() {
        String expected = "Hello Maven :)";
        HelloMaven helloMaven = new HelloMaven();

        String result = helloMaven.sayHelloToMavenWorld();

        Assertions.assertEquals(expected, result);
    }

}