public class Drill06_Rectangle {

    static class Rectangle {
        double width;
        double height;
        
        double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 4;
        r.height = 7;
        
        System.out.println("Width: " + r.width);
        System.out.println("Height: " + r.height);
        System.out.println("Area: " + r.area());
    }
}

