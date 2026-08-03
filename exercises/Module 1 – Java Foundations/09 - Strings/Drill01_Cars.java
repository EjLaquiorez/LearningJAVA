public class Drill01_Cars {
    static class Car{
        String brand;
        String model;
        int year;
    }

    public static void main(String [] args){

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;

        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        System.out.println("Brand: " + car2.brand);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);

        Car car3 = new Car();
        car3.brand = "Ford";
        car3.model = "Mustang";
        car3.year = 2023;

        System.out.println("Brand: " + car3.brand);
        System.out.println("Model: " + car3.model);
        System.out.println("Year: " + car3.year);
    }


}
