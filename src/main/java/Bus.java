import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengerCount() < capacity);
        this.passengers.add(person);
    }

    public void removePerson() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop, Person person) {
        if (busStop.queueCount() > 0 && busStop.queueCount() < capacity);
        busStop.removePersonFromQueue();
        addPassenger(person);
    }
}
