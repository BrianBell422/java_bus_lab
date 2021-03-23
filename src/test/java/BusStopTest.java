import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        busStop = new BusStop("Haymarket");
        person = new Person();
    }

    @Test
    public void canAddPersonToBusStop() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromBusStop() {
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.queueCount());
    }
}
