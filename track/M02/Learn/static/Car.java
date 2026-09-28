
class Car {

    static void convertKMIntoMiles() {
        System.out.println("Converting Kilometers into Miles");
    }

    void calculateMilage() {
        System.out.println("Calculating milage");
    }

    public static void main(String[] args) {
        Car.convertKMIntoMiles();

        Car nano = new Car();
        nano.calculateMilage();

        Car bmw = new Car();
        bmw.calculateMilage();

    }
}
