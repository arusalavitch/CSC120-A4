public class Car {
        constructor(maxCapacity) {
            this.passengers = [];
            this.maxCapacity = maxCapacity;
        }
    
        getCapacity() {
            return this.maxCapacity;
        }
    
        seatsRemaining() {
            return this.maxCapacity - this.passengers.length;
        }
    
        addPassenger(passenger) {
            if (this.passengers.length < this.maxCapacity) {
                this.passengers.push(passenger);
                return true;
            } else {
                return false;
            }
        }
    
        removePassenger(passenger) {
            const index = this.passengers.indexOf(passenger);
            if (index !== -1) {
                this.passengers.splice(index, 1);
                return true;
            } else {
                return false;
            }
        }
    
        printManifest() {
            if (this.passengers.length > 0) {
                console.log("Passengers on board:");
                this.passengers.forEach(passenger => console.log(passenger.name));
            } else {
                console.log("This car is EMPTY.");
            }
        }
}