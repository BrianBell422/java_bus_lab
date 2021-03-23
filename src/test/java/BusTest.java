import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 20);
        person = new Person();
        busStop = new BusStop("Haymarket");
        busStop.addPersonToQueue(person);
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePerson() {
        bus.addPassenger(person);
        bus.removePerson();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void pickUpPassenger() {
        bus.pickUp(busStop, person);
        assertEquals(0, busStop.queueCount());
        assertEquals(1, bus.passengerCount());
    }
}
