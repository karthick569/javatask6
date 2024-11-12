package task6;

public class Circle {
     
    private double radius;

    public Circle()
    {
        this.radius = 2.0; 
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateCircumference() 
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.radius + ", Circumference: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(7.0);
        System.out.println("Circle 2 - Radius: " + circle2.radius + ", Circumference: " + circle2.calculateCircumference());
    }
}
