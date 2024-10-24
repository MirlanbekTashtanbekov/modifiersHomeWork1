public class Circle {
    final double pi=3.14;
    private double radius;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area(double pi, double radius){
        System.out.println("Area: "+pi+" * "+ "("+radius+" * " +radius+")"+" = "+(pi*(radius*radius)));
    }

    public static void circumference (double pi, double radius){
        System.out.println("Circumference: "+pi +" * "+2+" * "+ radius+" = "+ (pi*2*radius));
    }

    @Override
    public String toString() {
        return "\nCircle{" +
                "\npi=" + pi +
                "\n radius=" + radius +
                '}';
    }
}
