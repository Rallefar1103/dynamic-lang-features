package desktop;

import org.junit.jupiter.api.Test;

import desktop.reflection.Person;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {
    @Test
    void sanityCheck() {
        Person person = new Person();
        assertNotNull(person);
    }
}
