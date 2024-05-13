public class Circle {
    private double radius;

    public Circle() {
        radius = 0.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5.0);
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(3.0);
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }

}
