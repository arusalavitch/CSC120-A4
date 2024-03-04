public class Passenger {
    private String name;

    // Constructor
    public Passenger(String name) {
        this.name = name;
    }

    // Accessor for the passenger's name
    public String getName() {
        return name;
    }

    // Attempt to board a Car
    public boolean boardCar(Car car) {
        if (car.addPassenger(this)) {
            System.out.println(name + " successfully boarded the car.");
            return true;
        } else {
            System.out.println(name + " could not board the car. It might be full.");
            return false;
        }
    }

    // Attempt to get off a Car
    public boolean getOffCar(Car car) {
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
