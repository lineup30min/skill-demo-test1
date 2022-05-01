import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest1test {
    // Here we need to add a test for our own function!
    @Test
    public void multiplication() {
        // A test that fail initially
        assertEquals(4, SkillDemoTest1.multiply(1,2)); 
    }
}

// Now we can push this to our repo