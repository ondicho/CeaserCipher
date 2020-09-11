import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void NewEncodeObjectGetsCorrectlyCreated_true() {
        Encode encode = new Encode("abc",2,"cde");
        assertEquals(true, encode instanceof Encode);
    }

}