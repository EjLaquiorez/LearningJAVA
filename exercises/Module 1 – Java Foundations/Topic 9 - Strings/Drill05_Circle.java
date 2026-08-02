public class Drill05_Circle {
    
    static class Circle {
        double radius;
        double area;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object
        Circle c = new Circle();
        c.radius = 5;
        
        // Calculate and store the area
        c.area = areaOfCircle(c.radius);
        
        // Print the result
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area);
    }
}