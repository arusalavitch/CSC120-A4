import java.util.ArrayList;

public class Train {
    public static Engine engine;
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

    public void printPassengerList() {
        System.out.println("Passengers aboard the train:");
        for (Car car : cars) {
            car.printPassengerList();
        }
    }
        public static void main(String[] args) {
            // Initialize the train with an electric engine, fuel capacity, number of cars, and passenger capacity per car
            Train myTrain = new Train(FuelType.ELECTRIC, 10.0, 3, 50);
            // Create passengers
            Passenger alice = new Passenger("Alice");
            Passenger bob = new Passenger("Bob");
            Passenger charlie = new Passenger("Charlie");
    
            // Board the passengers onto the first car of the train
            boolean aliceBoarded = alice.boardCar(myTrain.getCar(0));
            boolean bobBoarded = bob.boardCar(myTrain.getCar(0));
            // Attempt to board Charlie into a non-existent car to test error handling
            boolean charlieBoarded = charlie.boardCar(myTrain.getCar(2)); // Assuming indexing starts at 0 and we have less than 4 cars
    
            // Print boarding results
            System.out.println("Alice boarded: " + aliceBoarded);
            System.out.println("Bob boarded: " + bobBoarded);
            System.out.println("Charlie boarded: " + charlieBoarded);
    
            // Print the manifest of the first car and the whole train to check if Alice and Bob are listed
            System.out.println("\n Passenger list for Car 0:");
            myTrain.getCar(0).printPassengerList();
    
            System.out.println("\nPassenger list for the entire Train:");
            myTrain.printPassengerList();
    
            System.out.println("\n");
            System.out.println("Starting the train:");
            
            while (engine.go()) {
                System.out.println("Choo choo!");
            }
                System.out.println("Out of fuel.");

            // Extra operations to demonstrate functionality
            // Let's say Bob decides to get off the train
            boolean bobLeft = bob.getOffCar(myTrain.getCar(0));
            System.out.println("\nBob left the train: " + bobLeft);
    
            // Print the manifests again to see the change
            System.out.println("\nPassenger list for Car 0 after Bob leaves:");
            myTrain.getCar(0).printPassengerList();
    
            System.out.println("\nPassenger list for the entire Train after Bob leaves:");
            myTrain.printPassengerList();
        }
}
    
    

