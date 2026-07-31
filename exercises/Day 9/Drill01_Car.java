public class Drill01_Car {
    static class Car {
        String brand;
        String model;
        int year;
    }

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Corolla";
        car.year = 2022;

        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
    }
}
