import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ProjectTests {
    AlarmRadioClock clock;

    @Before public void setUp() {
        clock = new AlarmRadioClock(8,0,0,"AM", "1060AM");
    }

    @Test
    public void station() {
        assertEquals("1060AM", clock.getStation());
    }

    @Test
    public void getTime() {

        assertEquals("8:00AM", clock.getTime());
    }
}
