
import java.util.*;

public abstract class Cone extends Shape3D{
    private double baseRadius;
    private double height;
    private double SA;
    private double A;

    public Cone() {
        super();
        baseRadius = 0;
        height = 0;
    }
    public Cone(double baseRadius, double height, String name, String color, Location loc) {
        super(name, color, loc);
        this.baseRadius = baseRadius;
        this.height = height;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSA() {
        return SA;
    }

    public void setSA(double SA) {
        this.SA = SA;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    @Override
    public double calculateSurfaceArea() {
        SA = Math.sqrt((Math.pow(height, 2) + Math.pow(baseRadius, 2)) * baseRadius * Math.PI);
        return SA;
    }

    @Override
    public double calculateVolume() {
        A = ((height / 3) * Math.pow(baseRadius, 2)) * Math.PI;
        return A;
    }

}
