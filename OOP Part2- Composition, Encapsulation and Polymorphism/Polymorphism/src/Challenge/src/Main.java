public class Main {

    /*
    * We are going to go back to the car analogy.
    * Create a base class called Car
    * It should have a few fields that would be appropriate for a generic car class.
    * engine, cylinders, wheels, etc.
    * Constructor should intitialize cylinders (number of) and name, and set wheels to 4
    * and engine to true. Cylinder and names would be passed parameters.
    * Create appropriate getters.
    * Create some methods like startEngine, accelerate , and brake
    * show a message for each in the base class
    * Now create 3 sub classes for your favorite vehicles.
    * Override the appropriate methods to demonstrate polymorphism in use.
    * put all classes in the one java file (this one).
    */

    public static void main(String[] args) {

    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brake";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi {

}
