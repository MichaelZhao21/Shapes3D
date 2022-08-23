public class Sphere extends Shape3D {
    protected double radius;

    public Sphere(String name, String color, Location loc, double radius) {
        this.name = name;
        this.color = color;
        this.loc = loc;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        double vol = 4/3 * Math.PI * (Math.pow(radius, 3));
        return vol;
    }

    public double calculateSurfaceArea() {
        double surfarea = 4 * Math.PI * (Math.pow(radius, 2));
        return surfarea;
    }
}
