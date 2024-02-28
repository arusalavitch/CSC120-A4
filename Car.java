import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengers = new ArrayList<>();
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers aboard this car:");
            for (Passenger passenger : passengers) {
                System.out.println(passenger);
            }
        }
    }
}