import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {
    TimeCal timeCal = new TimeCal();

    @Test
    void main() {
        assertEquals(1.5, timeCal.calculateTime(150, 100));
    }
}