import java.util.ArrayList;

/**
 * Represents a car in a train.
 */
public class Car {
    private final ArrayList<Passenger> passengers;
    private final int maxCapacity;

    /**
     * Constructor for creating a Car with a maximum capacity.
     * @param maxCapacity The maximum capacity of the car.
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengers = new ArrayList<>();
    }

    /**
     * Getter for the passengers on board.
     * @return The list of passengers on board.
     */
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Getter for the capacity of the car.
     * @return The maximum capacity of the car.
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Calculates the remaining seats in the car.
     * @return The number of remaining seats in the car.
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * Attempts to add a passenger to the car.
     * @param p The passenger to add.
     * @return True if the passenger is successfully added, false otherwise.
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes a passenger from the car.
     * @param p The passenger to remove.
     * @return True if the passenger is successfully removed, false otherwise.
     */
    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    /**
     * Prints the list of passengers on board.
     */
    public void printPassengerList() {
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