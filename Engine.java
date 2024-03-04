public class Engine {
    // - a `FuelType` attribute to indicate what type of fuel it uses, and `double`s to store the current and maximum fuel levels (along with appropriate accessors for each).
    // - a constructor, which takes in initial values for the attributes named above and sets them appropriately
    // - a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
    // - a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    public boolean go() {
        if (currentFuelLevel > 0) {
            System.out.println("Remaining fuel level: " + currentFuelLevel);
            currentFuelLevel--;
            return true;
        } else {
            return false;
        }
    }
}