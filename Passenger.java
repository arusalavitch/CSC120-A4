public class Passenger {
    private final String name;

    /**
     * Constructor for creating a Passenger with a name.
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Getter for the passenger's name.
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Attempts to board a car.
     * @param car The car to board.
     * @return True if boarding is successful, false otherwise.
     */
    public boolean boardCar(Car car) {
        if (!car.getPassengers().contains(this) && car.addPassenger(this)) {
            System.out.println(name + " successfully boarded the car.");
            return true;
        } else {
            System.out.println(name + " could not board the car. It might be full or already onboard.");
            return false;
        }
    }

    /**
     * Attempts to leave a car.
     * @param car The car to leave.
     * @return True if leaving is successful, false otherwise.
     */
    public boolean leaveCar(Car car) {
        if (car.removePassenger(this)) {
            System.out.println(name + " successfully left the car.");
            return true;
        } else {
            System.out.println(name + " could not leave the car. They might not be on this car.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}