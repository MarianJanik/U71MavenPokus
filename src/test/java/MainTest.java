import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    public void testSum(){
        Main main = new Main();
        assertEquals(7,main.sumOf2Numbers(2,5));
    }
}
