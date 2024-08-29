import java.util.Scanner;

// Superclass for the Circle
class Circle {  // Not public, so no filename constraint
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

// Subclass for the Cylinder
class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Method to calculate the area of the cylinder
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Main class
public class Main {  // This class is public, so the file must be named Main.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create a Cylinder object with the given radius and height
        Cylinder cylinder = new Cylinder(radius, height);

        // Compute the area and volume of the cylinder
        double area = cylinder.area();
        double volume = cylinder.volume();

        // Display the results
        System.out.printf("The area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);
    }
}
