import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoolClassTest {
    @Test
    void testGenerateTrue() {
        CoolClass c1 = new CoolClass();
        Assertions.assertTrue(c1.generateTrue());
    }

    @Test
    void testGenerateFalse() {
        CoolClass c1 = new CoolClass();
        Assertions.assertFalse(c1.generateFalse());
    }
}
