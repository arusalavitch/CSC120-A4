import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacityPerCar) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacityPerCar));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    public void printManifest() {
        System.out.println("Passengers aboard the train:");
        for (Car car : cars) {
            car.printManifest();
        }
    }
    public static main()
}
