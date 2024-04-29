/**
 * Represents an engine for a train.
 */
public class Engine {
    private final FuelType fuelType;
    private double currentFuelLevel;
    private final double maxFuelLevel;

    /**
     * Constructor for creating an Engine with fuel type and maximum fuel level.
     * @param fuelType The type of fuel used by the engine.
     * @param maxFuelLevel The maximum fuel level of the engine.
     */
    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Gets the fuel type of the engine.
     * @return The fuel type of the engine.
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Gets the current fuel level of the engine.
     * @return The current fuel level of the engine.
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * Gets the maximum fuel level of the engine.
     * @return The maximum fuel level of the engine.
     */
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    /**
     * Refuels the engine, resetting the current fuel level to the maximum.
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    /**
     * Moves the train, decreasing the current fuel level.
     * @return True if the train can move (fuel level > 0), false otherwise.
     */
    public boolean move() {
        if (currentFuelLevel > 0) {
            System.out.println("Remaining fuel level: " + currentFuelLevel);
            currentFuelLevel--;
            return true;
        } else {
            return false;
        }
    }
}