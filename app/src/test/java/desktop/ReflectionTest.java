package desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {
    @Test
    void sanityCheck() throws ClassNotFoundException {
        Class<?> person = Class.forName("Employee");
        assertNotNull(person);
    }
}
