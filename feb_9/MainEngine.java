package feb_9;

class Engine {
    private String engineType;
    public Engine(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() {
        return engineType;
    }
}
class Car {
    private String carName;
    private Engine engine; // Car contains Engine
    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }
    public void displayDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Engine Type: " + engine.getEngineType());
    }
}
public class MainEngine {
    public static void main(String[] args) {
        Engine engine = new Engine("Petrol");
        Car car = new Car("Toyota", engine);
        car.displayDetails();
    }
}
