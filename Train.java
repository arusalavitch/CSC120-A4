public class Train {
    constructor(fuelType, fuelCapacity, numCars, passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = [];
        for (let i = 0; i < numCars; i++) {
            this.cars.push(new Car(passengerCapacity));
        }
    }

    getEngine() {
        return this.engine;
    }

    getCar(index) {
        return this.cars[index];
    }

    getMaxCapacity() {
        return this.cars.reduce((totalCapacity, car) => totalCapacity + car.getCapacity(), 0);
    }

    seatsRemaining() {
        return this.cars.reduce((remainingSeats, car) => remainingSeats + car.seatsRemaining(), 0);
    }

    printManifest() {
        console.log("Train Manifest:");
        this.cars.forEach((car, index) => {
            console.log(`Car ${index + 1}:`);
            car.printManifest();
        });
    }
}
