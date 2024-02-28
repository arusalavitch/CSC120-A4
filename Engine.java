//- a `FuelType` attribute to indicate what type of fuel it uses, and `double`s to store the current and maximum fuel levels (along with appropriate accessors for each).
//- a constructor, which takes in initial values for the attributes named above and sets them appropriately
//- a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
//- a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.


public class Engine {
    constructor(fuelType, fuelLevel) {
        this.fuelType = fuelType;
        this.currentFuelLevel = fuelLevel;
        this.maxFuelLevel = fuelLevel;
    }

    refuel() {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    go() {
        if (this.currentFuelLevel > 0) {
            console.log(`Remaining fuel level: ${this.currentFuelLevel}`);
            this.currentFuelLevel--;
            return true;
        } else {
            console.log("Out of fuel.");
            return false;
        }
    }
}