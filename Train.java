import java.util.ArrayList;

/**
 * Represents a train consisting of an engine and multiple cars.
 */
public class Train {
    private final Engine engine;
    private final ArrayList<Car> cars;

    /**
     * Constructor for creating a Train with an engine and cars.
     * @param fuelType The fuel type of the engine.
     * @param fuelCapacity The fuel capacity of the engine.
     * @param nCars The number of cars in the train.
     * @param passengerCapacityPerCar The passenger capacity per car.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacityPerCar) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacityPerCar));
        }
    }

    /**
     * Gets the engine of the train.
     * @return The engine of the train.
     */
    public Engine getEngine() {
        return engine;
    }
}